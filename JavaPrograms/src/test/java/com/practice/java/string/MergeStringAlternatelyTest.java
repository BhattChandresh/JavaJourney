package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringAlternatelyTest {
    private MergeStringAlternately mergeStringAlternately;

    @BeforeEach
    public void init() {
        mergeStringAlternately = new MergeStringAlternately();
    }

    @Test
    void testMergeStrings() {
        assertEquals("apbqcd", mergeStringAlternately.mergeStrings("abcd", "pq"));
        assertEquals("apbqcr", mergeStringAlternately.mergeStrings("abc", "pqr"));
        assertEquals("apbqrs", mergeStringAlternately.mergeStrings("ab", "pqrs"));
        assertEquals("abababab", mergeStringAlternately.mergeStrings("aaaa", "bbbb"));
    }
}