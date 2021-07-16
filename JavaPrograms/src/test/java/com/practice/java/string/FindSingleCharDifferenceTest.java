package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FindSingleCharDifferenceTest {
    private FindSingleCharDifference findSingleCharDifference;

    @BeforeEach
    public void init() {
        findSingleCharDifference = new FindSingleCharDifference();
    }

    @Test
    void testGetTheAdditionalCharacter() {
        assertEquals("y", findSingleCharDifference.getTheAdditionalCharacter("", "y"));
        assertEquals("e", findSingleCharDifference.getTheAdditionalCharacter("abcd", "abcde"));
        assertEquals("a", findSingleCharDifference.getTheAdditionalCharacter("a", "aa"));
        assertEquals("b", findSingleCharDifference.getTheAdditionalCharacter("rudravivanshivansh", "rudrabvivanshivansh"));
        assertEquals("a", findSingleCharDifference.getTheAdditionalCharacter("ae", "aea"));
        assertEquals("b", findSingleCharDifference.getTheAdditionalCharacter("chandresh", "hchersndab"));
    }
}