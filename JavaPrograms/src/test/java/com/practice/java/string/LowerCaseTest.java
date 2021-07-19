package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LowerCaseTest {
    private LowerCase lowerCase;

    @BeforeEach
    public void init() {
        lowerCase = new LowerCase();
    }

    @Test
    void testUpperCaseToLowerCase() {
        assertEquals("hello", lowerCase.upperCaseToLowerCase("Hello"));
        assertEquals("here", lowerCase.upperCaseToLowerCase("here"));
        assertEquals("lovely", lowerCase.upperCaseToLowerCase("LOVELY"));
        assertEquals("", lowerCase.upperCaseToLowerCase(""));
        assertEquals("here", lowerCase.upperCaseToLowerCase("here"));
        assertEquals("chandresh bhatt", lowerCase.upperCaseToLowerCase("CHaNdREsh BhAtT"));
    }
}