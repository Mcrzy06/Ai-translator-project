package com.aitranslator_at;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class AiTranslatorController {

    private final WordDatabase wordDatabase;

    public AiTranslatorController(WordDatabase wordDatabase) {
        this.wordDatabase = wordDatabase;
    }

    @RequestMapping("/")
    public String test(){
        return "will it work?";
    }

    @GetMapping("/words")
    public List<Word> getAllWords() {
        return wordDatabase.findAll();
    }

    @PostMapping("/words")
    public Word addWord(@RequestBody Word word) {
        return wordDatabase.save(word);
    }
}
