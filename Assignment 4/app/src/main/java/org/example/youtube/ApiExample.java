package org.example.youtube;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.ChannelListResponse;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class ApiExample {
    private static final String API_KEY = "AIzaSyAIysgwdyhIWKH9kspjW0bMBsic0C0H-l4"; // Replace this with your actual API key
    private static final String APPLICATION_NAME = "API code samples";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    public static YouTube getService() throws GeneralSecurityException, IOException {
        final var httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        return new YouTube.Builder(httpTransport, JSON_FACTORY, request -> {})
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static void main(String[] args) {
        try {
            YouTube youtubeService = getService();
            YouTube.Channels.List request = youtubeService.channels()
                    .list("snippet,contentDetails,statistics");
            ChannelListResponse response = request
                    .setId("UC_x5XG1OV2P6uZZ5FSM9Ttw") // Google Developers channel
                    .setKey(API_KEY)
                    .execute();

            response.getItems().forEach(channel -> {
                System.out.println("Title: " + channel.getSnippet().getTitle());
                System.out.println("Description: " + channel.getSnippet().getDescription());
                System.out.println("Subscribers: " + channel.getStatistics().getSubscriberCount());
                System.out.println("Total Views: " + channel.getStatistics().getViewCount());
                System.out.println("Total Videos: " + channel.getStatistics().getVideoCount());
                System.out.println("Custom URL: " + channel.getSnippet().getCustomUrl());
                System.out.println("Published At: " + channel.getSnippet().getPublishedAt());
                System.out.println("Uploads Playlist ID: " + channel.getContentDetails().getRelatedPlaylists().getUploads());
                System.out.println("Thumbnails: " + channel.getSnippet().getThumbnails().getHigh().getUrl());
            });

        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
    }

}
