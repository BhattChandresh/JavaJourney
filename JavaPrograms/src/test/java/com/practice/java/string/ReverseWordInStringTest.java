package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordInStringTest {
    private  ReverseWordInString reverse;

    @BeforeEach
    public void init() {
        reverse = new ReverseWordInString();
    }

    @Test
    void reverseWordInString() {
        assertEquals("bob like even not does Alice", reverse.reverseWordInString("Alice does not even like bob"));
        assertEquals("blue is sky the", reverse.reverseWordInString("the sky is blue"));
        assertEquals("world hello", reverse.reverseWordInString("               hello        world           "));
        assertEquals("example good a", reverse.reverseWordInString("a    good             example"));
        assertEquals("Alice Loves Bob", reverse.reverseWordInString("      Bob          Loves     Alice           "));
    }
}