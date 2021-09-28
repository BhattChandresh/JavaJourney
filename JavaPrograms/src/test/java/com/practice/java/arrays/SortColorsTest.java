package com.practice.java.arrays;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {
    private SortColors sortColors;

    @BeforeEach
    public void init() {
        sortColors = new SortColors();
    }

    @Test
    @Ignore
    void testSortRWBWithMap() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sortColors.sortColorWithMap(new int[]{2, 0, 2, 1, 1, 0}));
        assertArrayEquals(new int[]{0, 1, 2}, sortColors.sortColorWithMap(new int[]{2, 0, 1}));
        assertArrayEquals(new int[]{0}, sortColors.sortColorWithMap(new int[]{0}));
        assertArrayEquals(new int[]{1}, sortColors.sortColorWithMap(new int[]{1}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, sortColors.sortColorWithMap(new int[]{2, 0, 2, 1, 1, 0, 0, 1, 2, 2, 2, 2, 1, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}, sortColors.sortColorWithMap(new int[]{0, 2, 1, 1, 2, 0, 0, 1, 2}));
        assertArrayEquals(null, sortColors.sortColorWithMap(new int[]{}));
    }

    @Test
    void testSortColorLinearTime() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sortColors.sortColorLinearTime(new int[]{2, 0, 2, 1, 1, 0}));
        assertArrayEquals(new int[]{0, 1, 2}, sortColors.sortColorLinearTime(new int[]{2, 0, 1}));
        assertArrayEquals(new int[]{0}, sortColors.sortColorLinearTime(new int[]{0}));
        assertArrayEquals(new int[]{1}, sortColors.sortColorLinearTime(new int[]{1}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, sortColors.sortColorLinearTime(new int[]{2, 0, 2, 1, 1, 0, 0, 1, 2, 2, 2, 2, 1, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}, sortColors.sortColorLinearTime(new int[]{0, 2, 1, 1, 2, 0, 0, 1, 2}));
        assertArrayEquals(null, sortColors.sortColorLinearTime(new int[]{}));
    }

    @Test
    void testSortColorFunctionalApproach() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sortColors.sortColorWithFunctionalApproach(new int[]{2, 0, 2, 1, 1, 0}));
        assertArrayEquals(new int[]{0, 1, 2}, sortColors.sortColorWithFunctionalApproach(new int[]{2, 0, 1}));
        assertArrayEquals(new int[]{0}, sortColors.sortColorWithFunctionalApproach(new int[]{0}));
        assertArrayEquals(new int[]{1}, sortColors.sortColorWithFunctionalApproach(new int[]{1}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, sortColors.sortColorWithFunctionalApproach(new int[]{2, 0, 2, 1, 1, 0, 0, 1, 2, 2, 2, 2, 1, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}, sortColors.sortColorWithFunctionalApproach(new int[]{0, 2, 1, 1, 2, 0, 0, 1, 2}));
        assertArrayEquals(null, sortColors.sortColorWithFunctionalApproach(new int[]{}));
    }
}