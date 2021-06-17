package com.practice.java.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsecutiveDuplicatesTest {
    private ConsecutiveDuplicates consecutiveDuplicates;

    @BeforeEach
    public void init() {
        consecutiveDuplicates = new ConsecutiveDuplicates();
    }

    @Test
    void testRemoveConsecutiveDuplicates() {
        assertEquals("ab", consecutiveDuplicates.removeConsecutiveDuplicates("aaaaabbbbbb"));
        assertEquals("geksforgeks", consecutiveDuplicates.removeConsecutiveDuplicates("geeksforgeeks"));
        assertEquals("abababc", consecutiveDuplicates.removeConsecutiveDuplicates("abababc"));
        assertEquals("abababc", consecutiveDuplicates.removeConsecutiveDuplicates("abababc"));
        assertEquals("t", consecutiveDuplicates.removeConsecutiveDuplicates("ttttttttt"));
        assertTrue(consecutiveDuplicates.removeConsecutiveDuplicates("").isEmpty());
    }
}