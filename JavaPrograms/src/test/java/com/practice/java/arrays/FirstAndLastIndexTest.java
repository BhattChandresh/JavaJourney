package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class FirstAndLastIndexTest {
    private FirstAndLastIndex searchIndex;

    @BeforeEach
    public void init() {
        searchIndex = new FirstAndLastIndex();
    }

    @Test
    void findFirstAndLastElementPositionLinearSearch() {
        assertArrayEquals(new int[]{3, 12}, searchIndex.findFirstAndLastElementPositionLinearSearch(new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 11, 12, 13, 15}, 8));
        assertArrayEquals(new int[]{1, 2}, searchIndex.findFirstAndLastElementPositionLinearSearch(new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 11, 12, 13, 15}, 7));
        assertArrayEquals(new int[]{-1, -1}, searchIndex.findFirstAndLastElementPositionLinearSearch(new int[]{}, 1));
        assertArrayEquals(new int[]{3, 4}, searchIndex.findFirstAndLastElementPositionLinearSearch(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, searchIndex.findFirstAndLastElementPositionLinearSearch(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}