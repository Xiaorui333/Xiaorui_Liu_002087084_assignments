package org.example.youtube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@RestController
public class YouTubeController {

    private final YouTubeService youTubeService;

    public YouTubeController(YouTubeService youTubeService) {
        this.youTubeService = youTubeService;
    }

    @GetMapping("/news")
    public String getYouTubeResults(@RequestParam String topic) throws GeneralSecurityException, IOException {
        List<String> results = youTubeService.search(topic);

        StringBuilder response = new StringBuilder("<h1>Search Results for: " + topic + "</h1>");
        for (String result : results) {
            response.append("<p>").append(result).append("</p>");
        }

        return response.toString();
    }
}
