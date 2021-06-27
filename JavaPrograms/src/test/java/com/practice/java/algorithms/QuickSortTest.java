package com.practice.java.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] expectedVal1 = {2, 3, 4, 5, 6, 7, 8};
        int[] inputArr1 = {6, 8, 7, 2, 4, 3, 5};
        assertArrayEquals(expectedVal1, QuickSort.quickSort(inputArr1, 0, inputArr1.length - 1));
        int[] expectedVal2 = {1, 3, 5, 6, 7, 8, 9, 10};
        int[] inputArr2 = {10, 7, 1, 3, 5, 8, 9, 6};
        assertArrayEquals(expectedVal2, QuickSort.quickSort(inputArr2, 0, inputArr2.length - 1));
        int[] expectedVal3 = {0, 0, 4, 6, 8, 12, 17, 43, 74, 81, 92, 754, 912, 1098};
        int[] inputArr3 = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        assertArrayEquals(expectedVal3, QuickSort.quickSort(inputArr3, 0, inputArr3.length - 1));
    }
}