package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    public void init() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void testGetLengthOfLastWord() {
        assertEquals(5, lengthOfLastWord.getLengthOfLastWord("hello world"));
        assertEquals(0, lengthOfLastWord.getLengthOfLastWord(""));
        assertEquals(9, lengthOfLastWord.getLengthOfLastWord("chandresh"));
        assertEquals(1, lengthOfLastWord.getLengthOfLastWord("chandresh b"));
    }
}