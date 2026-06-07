package com.aitranslator_at;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfWord;
    private String translation;

    public Word(){}

    public Word(String nameOfWord,String translation){
        this.nameOfWord = nameOfWord;
        this.translation = translation;
    }

    public String getNameOfWord() {
        return nameOfWord;
    }

    public void setNameOfWord(String nameOfWord) {
        this.nameOfWord = nameOfWord;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
