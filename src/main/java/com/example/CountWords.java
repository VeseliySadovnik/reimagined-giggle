package com.example;

public class CountWords {
    public int countWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }
}
