package com.practice.java.arrays;

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
    void sortRGBWithMap() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sortColors.sortRGBWithMap(new int[]{2, 0, 2, 1, 1, 0}));
        assertArrayEquals(new int[]{0, 1, 2}, sortColors.sortRGBWithMap(new int[]{2, 0, 1}));
        assertArrayEquals(new int[]{0}, sortColors.sortRGBWithMap(new int[]{0}));
        assertArrayEquals(new int[]{1}, sortColors.sortRGBWithMap(new int[]{1}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, sortColors.sortRGBWithMap(new int[]{2, 0, 2, 1, 1, 0, 0, 1, 2, 2, 2, 2, 1, 0}));
    }
}