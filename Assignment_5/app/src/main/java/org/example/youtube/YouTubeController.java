package org.example.youtube;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.jooq.tables.SearchResults.SEARCH_RESULTS;
@RestController
public class YouTubeController {

    private final YouTubeService youTubeService;

    public YouTubeController(YouTubeService youTubeService) {
        this.youTubeService = youTubeService;
    }

    @GetMapping("/news")
    public String getYouTubeResults(@RequestParam String topic) throws GeneralSecurityException, IOException, SQLException {

        String userName = "postgres.uzankumhwijvaxvbfwmh";
        String password = "Frida1195433053#";
        String url = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:6543/postgres";
        Settings settings = new Settings()
                .withExecuteLogging(true)
                .withRenderFormatted(false);

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES, settings);

            // Step 1: Query cached results from the database using JOOQ
            List<String> cachedResults = create.select(SEARCH_RESULTS.RESULT)
                    .from(SEARCH_RESULTS)
                    .where(SEARCH_RESULTS.TOPIC.equalIgnoreCase(topic))
                    .fetch()
                    .stream()
                    .map(record -> record.get(SEARCH_RESULTS.RESULT))
                    .collect(Collectors.toList());

            if (!cachedResults.isEmpty()) {
                System.out.println("Found cached results in the database for topic: " + topic);
                return buildHtmlResponse(topic, cachedResults);
            }


            // Step 2: Call YouTubeService to fetch new results
            System.out.println("No cached results found. Calling YouTube API for topic: " + topic);
            List<String> newResults = youTubeService.search(topic);

            // Step 3: Persist new results in the database
            newResults.forEach(result ->
                    create.insertInto(SEARCH_RESULTS)
                            .columns(SEARCH_RESULTS.TOPIC, SEARCH_RESULTS.RESULT)
                            .values(topic, result)
                            .execute()
            );

            return buildHtmlResponse(topic, newResults);

        } catch (Exception e) {
            e.printStackTrace();
            return "An unexpected error occurred.";
        }
    }

    private String buildHtmlResponse(String topic, List<String> results) {
        StringBuilder response = new StringBuilder("<h1>Search Results for: " + topic + "</h1>");
        results.forEach(result -> response.append("<p>").append(result).append("</p>"));
        return response.toString();
    }
}
