package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdjacentDuplicatesTest {
    private AdjacentDuplicates adjacentDuplicates;

    @BeforeEach
    public void init() {
        adjacentDuplicates = new AdjacentDuplicates();
    }

    @Test
    void testRemoveAdjacentDuplicatesChars() {
        assertEquals("ay", adjacentDuplicates.removeAdjacentDuplicatesChars("azxxzy"));
        assertTrue(adjacentDuplicates.removeAdjacentDuplicatesChars("aaaabbbb").isEmpty());
        assertEquals("a", adjacentDuplicates.removeAdjacentDuplicatesChars("aabccba"));
        assertEquals("gksforgks", adjacentDuplicates.removeAdjacentDuplicatesChars("geeksforgeeks"));
        assertEquals("abababc", adjacentDuplicates.removeAdjacentDuplicatesChars("abababc"));
        assertTrue(adjacentDuplicates.removeAdjacentDuplicatesChars("aaaaa").isEmpty());
        assertTrue(adjacentDuplicates.removeAdjacentDuplicatesChars("caaabbbaacdddd").isEmpty());
        assertEquals("acac", adjacentDuplicates.removeAdjacentDuplicatesChars("acaaabbbacdddd"));
        assertEquals("a", adjacentDuplicates.removeAdjacentDuplicatesChars("bba"));
        assertTrue(adjacentDuplicates.removeAdjacentDuplicatesChars("").isEmpty());
        assertTrue(adjacentDuplicates.removeAdjacentDuplicatesChars("aabbcc").isEmpty());
        assertEquals("bd", adjacentDuplicates.removeAdjacentDuplicatesChars("aabccd"));
        assertEquals("de", adjacentDuplicates.removeAdjacentDuplicatesChars("aabccbde"));
    }
}