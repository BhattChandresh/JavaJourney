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
    void testFindIndexEqualToSum() {
        assertArrayEquals(twoSumEqualTarget.findIndexEqualToSum(new int[]{1, 2, 4, 5, 6}, 6), new int[]{0, 3, 1, 2});
        assertArrayEquals(twoSumEqualTarget.findIndexEqualToSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }
}