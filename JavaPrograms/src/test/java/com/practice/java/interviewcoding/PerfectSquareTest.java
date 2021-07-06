package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PerfectSquareTest {
    private PerfectSquare perfectSquare;

    @BeforeEach
    public void init() {
        perfectSquare = new PerfectSquare();
    }

    @Test
    void testIsPerfectSquare() {
        assertTrue(perfectSquare.isPerfectSquare(49));
        assertTrue(perfectSquare.isPerfectSquare(16));
        assertTrue(perfectSquare.isPerfectSquare(2500));
        assertFalse(perfectSquare.isPerfectSquare(14));
        assertFalse(perfectSquare.isPerfectSquare(1200));
    }
}