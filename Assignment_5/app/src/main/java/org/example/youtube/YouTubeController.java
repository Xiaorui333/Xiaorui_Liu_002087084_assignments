package org.example.youtube;

import org.jooq.DSLContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.jooq.tables.SearchResults.SEARCH_RESULTS;

@RestController
public class YouTubeController {

    private final YouTubeService youTubeService;
    private final DSLContext dsl;

    public YouTubeController(YouTubeService youTubeService, DSLContext dsl) {
        this.youTubeService = youTubeService;
        this.dsl = dsl;
    }

    @GetMapping("/news")
    public String getYouTubeResults(@RequestParam String topic) throws GeneralSecurityException, IOException {
        // Step 1: Query cached results from the database using JOOQ
        List<String> cachedResults = dsl.select(SEARCH_RESULTS.RESULT)
                .from(SEARCH_RESULTS)
                .where(SEARCH_RESULTS.TOPIC.eq(topic))
                .fetch()
                .stream()
                .map(record -> record.get(SEARCH_RESULTS.RESULT))
                .collect(Collectors.toList());

        if (!cachedResults.isEmpty()) {
            return buildHtmlResponse(topic, cachedResults);
        }

        // Step 2: Call YouTubeService to fetch new results
        List<String> newResults = youTubeService.search(topic);

        // Step 3: Persist new results in the database
        newResults.forEach(result ->
                dsl.insertInto(SEARCH_RESULTS)
                        .columns(SEARCH_RESULTS.TOPIC, SEARCH_RESULTS.RESULT)
                        .values(topic, result)
                        .execute()
        );

        return buildHtmlResponse(topic, newResults);
    }

    private String buildHtmlResponse(String topic, List<String> results) {
        StringBuilder response = new StringBuilder("<h1>Search Results for: " + topic + "</h1>");
        results.forEach(result -> response.append("<p>").append(result).append("</p>"));
        return response.toString();
    }
}
