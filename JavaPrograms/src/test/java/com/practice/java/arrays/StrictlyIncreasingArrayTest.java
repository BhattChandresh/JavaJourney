package com.practice.java.arrays;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StrictlyIncreasingArrayTest {
    StrictlyIncreasingArray increasingArray;

    @BeforeEach
    public void init() {
        increasingArray = new StrictlyIncreasingArray();
    }

    @Test
    void testIsStrictlyIncreasingArr() {
        assertTrue(increasingArray.IsStrictlyIncreasingArr(new int[]{1, 2, 10, 5, 7}));
        assertFalse(increasingArray.IsStrictlyIncreasingArr(new int[]{1, 1, 1}));
        assertFalse(increasingArray.IsStrictlyIncreasingArr(new int[]{2, 3, 1, 2}));
        assertTrue(increasingArray.IsStrictlyIncreasingArr(new int[]{1, 2, 3, 4, 5, 6}));
        assertFalse(increasingArray.IsStrictlyIncreasingArr(new int[]{1, 2, 6, 5, 4}));
        assertTrue(increasingArray.IsStrictlyIncreasingArr(new int[]{1, 2, 3, 5, 7, 11}));
        assertFalse(increasingArray.IsStrictlyIncreasingArr(new int[]{12, 13, 14, 16, 18, 20, 14, 22, 26, 13}));
        assertTrue(increasingArray.IsStrictlyIncreasingArr(new int[]{12, 13, 14, 16, 18, 20, 21, 22, 100, 26}));
    }
}