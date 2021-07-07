package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordPatternTest {
    private WordPattern wordPattern;

    @BeforeEach
    public void init() {
        wordPattern = new WordPattern();
    }

    @Test
    void validateWordPattern() {
        assertTrue(wordPattern.validateWordPattern("abba", "dog cat cat dog"));
        assertTrue(wordPattern.validateWordPattern("aaaa", "cat cat cat cat"));
        assertTrue(wordPattern.validateWordPattern("abcd", "one two three four"));
        assertFalse(wordPattern.validateWordPattern("abba", "one two two four"));
        assertFalse(wordPattern.validateWordPattern("abba", "one two two four foure"));
        assertTrue(wordPattern.validateWordPattern("abcdbbacd", "one two three four two two one three four"));
    }
}