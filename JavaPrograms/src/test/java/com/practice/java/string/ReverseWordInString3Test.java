package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordInString3Test {
    private ReverseWordInString3 reverseWordInString3;

    @BeforeEach
    public void init() {
        reverseWordInString3 = new ReverseWordInString3();
    }

    @Test
    void reverseCharactersInEachWordBruteForce() {
        assertEquals("doG gniD", reverseWordInString3.reverseCharactersInEachWordBruteForce("God Ding"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordInString3.reverseCharactersInEachWordBruteForce("Let's take LeetCode contest"));
        assertEquals("", reverseWordInString3.reverseCharactersInEachWordBruteForce(""));
        assertEquals("hserdnahC ttahB", reverseWordInString3.reverseCharactersInEachWordBruteForce("Chandresh Bhatt"));
    }
}