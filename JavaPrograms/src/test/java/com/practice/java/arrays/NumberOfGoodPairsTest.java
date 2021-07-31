package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfGoodPairsTest {
    NumberOfGoodPairs numberOfGoodPairs;

    @BeforeEach
    public void init() {
        numberOfGoodPairs = new NumberOfGoodPairs();
    }

    @Test
    void testFindGoodPairsBruteForce() {
        assertEquals(4, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 1, 1, 1}));
        assertEquals(0, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 2, 3}));
    }

    @Test
    void testFindGoodPairsLinearTime() {
        assertEquals(4, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 1, 1, 1}));
        assertEquals(0, numberOfGoodPairs.findGoodPairsBruteForce(new int[]{1, 2, 3}));
    }
}