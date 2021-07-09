package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestSumFromSubArrayTest {
    private LargestSumFromSubArray largestSumFromSubArray;

    @BeforeEach
    public void init() {
        largestSumFromSubArray = new LargestSumFromSubArray();
    }

    @Test
    void testGetLargestSumFromSubArrayInLinearTime() {
        assertEquals(7, largestSumFromSubArray.getLargestSumFromSubArrayInLinearTime(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        assertEquals(23, largestSumFromSubArray.getLargestSumFromSubArrayInLinearTime(new int[]{5, 4, -1, 7, 8}));
        assertEquals(1, largestSumFromSubArray.getLargestSumFromSubArrayInLinearTime(new int[]{1}));
        assertEquals(6, largestSumFromSubArray.getLargestSumFromSubArrayInLinearTime(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(7, largestSumFromSubArray.getLargestSumFromSubArrayInLinearTime(new int[]{-2, -5, 6, -2, -3, 1, 5, -6}));
    }
}