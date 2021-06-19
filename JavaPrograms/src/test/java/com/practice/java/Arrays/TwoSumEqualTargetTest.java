package com.practice.java.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumEqualTargetTest {
    private TwoSumEqualTarget twoSumEqualTarget;

    @BeforeEach
    public void init() {
        twoSumEqualTarget = new TwoSumEqualTarget();
    }

    @Test
    void testFindIndexEqualToSumBruteForce1() {
        assertArrayEquals(twoSumEqualTarget.findIndexEqualToSumBruteForce1(new int[]{1, 2, 4, 5, 6}, 6), new int[]{0, 3, 1, 2}); //This is the extra check.
        assertArrayEquals(twoSumEqualTarget.findIndexEqualToSumBruteForce1(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(new int[]{3, 4}, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 3, 7, 9, 2}, 11));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 3, 7, 9, 2}, 25));
        assertArrayEquals(new int[]{0, 1}, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 6}, 7));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{}, 1));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{5}, 5));
    }

    @Test
    void testFindIndexEqualToSumBruteForce2() {
        assertArrayEquals(new int[]{3, 4}, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 3, 7, 9, 2}, 11));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 3, 7, 9, 2}, 25));
        assertArrayEquals(new int[]{0, 1}, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 6}, 7));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{}, 1));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{5}, 5));
        assertArrayEquals(new int[]{0, 3, 1, 2}, twoSumEqualTarget.findIndexEqualToSumBruteForce1(new int[]{1, 2, 4, 5, 6}, 6)); //This is the extra check.
    }

    @Test
    void testFindIndexEqualToSum() {
        assertArrayEquals(new int[]{3, 4}, twoSumEqualTarget.findIndexEqualToSum(new int[]{1, 3, 7, 9, 2}, 11));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 3, 7, 9, 2}, 25));
        assertArrayEquals(new int[]{0, 1}, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{1, 6}, 7));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{}, 1));
        assertArrayEquals(null, twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{5}, 5));
        assertArrayEquals(new int[]{0, 3, 1, 2}, twoSumEqualTarget.findIndexEqualToSumBruteForce1(new int[]{1, 2, 4, 5, 6}, 6)); //This is the extra check.
    }
}