package org.example.youtube;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

@Service
public class YouTubeService {

    private static final String API_KEY = "AIzaSyAIysgwdyhIWKH9kspjW0bMBsic0C0H-l4";
    private static final String APPLICATION_NAME = "YouTubeSearchApp";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    public List<String> search(String topic) throws GeneralSecurityException, IOException {
        YouTube youtubeService = new YouTube.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY, request -> {}
        ).setApplicationName(APPLICATION_NAME).build();

        YouTube.Search.List request = youtubeService.search()
                .list("snippet")
                .setQ(topic)
                .setType("video")
                .setMaxResults(10L)
                .setKey(API_KEY);

        SearchListResponse response = request.execute();

        List<String> results = new ArrayList<>();
        for (SearchResult result : response.getItems()) {
            String title = result.getSnippet().getTitle();
            String url = "https://www.youtube.com/watch?v=" + result.getId().getVideoId();
            results.add(title + " - <a href='" + url + "'>" + url + "</a>");
        }

        return results;
    }
}
