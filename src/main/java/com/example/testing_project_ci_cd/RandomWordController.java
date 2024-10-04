package com.example.testing_project_ci_cd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RandomWordController {

    private static final String RANDOM_WORD_API = "https://random-word-api.herokuapp.com/word?number=1";

    @GetMapping("/random-word")
    public String getRandomWord() {
        RestTemplate restTemplate = new RestTemplate();
        String[] words = restTemplate.getForObject(RANDOM_WORD_API, String[].class);
        return words != null && words.length > 0 ? words[0] : "No word found";
    }
}