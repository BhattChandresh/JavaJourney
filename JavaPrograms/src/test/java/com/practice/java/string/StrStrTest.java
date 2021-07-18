package com.practice.java.string;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StrStrTest {
    private StrStr strStr;

    @BeforeEach
    public void init() {
        strStr = new StrStr();
    }

    @Test
    void testCustomIndexOf() {
        assertEquals(0, strStr.customIndexOf("", ""));
        assertEquals(-1, strStr.customIndexOf("aaaaa", "bba"));
        assertEquals(2, strStr.customIndexOf("hello", "ll"));
        assertEquals(-1, strStr.customIndexOf("GeeksForGeeks", "Fr"));
        assertEquals(5, strStr.customIndexOf("GeeksForGeeks", "For"));
        assertEquals(1, strStr.customIndexOf("GeeksForGeeks", "ee"));
    }
}