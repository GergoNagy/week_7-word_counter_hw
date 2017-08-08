package com.example.user.wordcounter;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class WordCounter {

    private String sentence;
    private WordCounter[] numberOfWords;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    public int getNumberOfWord(){
        String[] result = sentence.trim().split("\\s+");
        return result.length;
    }

}
