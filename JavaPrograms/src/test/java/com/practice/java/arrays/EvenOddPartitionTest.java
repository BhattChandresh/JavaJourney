package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EvenOddPartitionTest {

    private EvenOddPartition evenOddPartition;

    @BeforeEach
    public void init() {
        evenOddPartition = new EvenOddPartition();
    }

    @Test
    void testPartitionEvenAndOdd() {
        int[] expectedArr1 = {2, 4, 6, 8, 10, 16, 52, 100};
        assertArrayEquals(expectedArr1, evenOddPartition.partitionEvenAndOdd(new int[]{2, 4, 6, 8, 10, 16, 52, 100}));

        int[] expectedArr2 = {3, 5, 7, 7, 5, 3, 9, 1, 13, 17};
        assertArrayEquals(expectedArr2, evenOddPartition.partitionEvenAndOdd(new int[]{3, 5, 7, 7, 5, 3, 9, 1, 13, 17}));

        int[] expectedArr3 = {3, 3, 3, 3, 7, 7, 7, 7, 4};
        assertArrayEquals(expectedArr3, evenOddPartition.partitionEvenAndOdd(new int[]{3, 3, 3, 3, 4, 7, 7, 7, 7}));

        int[] expectedArr4 = {3, 3, 3, 3, 7, 7, 7, 7, 4};
        assertArrayEquals(expectedArr4, evenOddPartition.partitionEvenAndOdd(new int[]{3, 3, 3, 3, 4, 7, 7, 7, 7}));

        int[] expectedArr5 = {137, 127, 947, 199, 735, 424, 592, 722, 956, 324};
        assertArrayEquals(expectedArr5, evenOddPartition.partitionEvenAndOdd(new int[]{137, 324, 424, 199, 735, 947, 592, 722, 956, 127}));

        int[] expectedArr6 = {137, 127, 947, 199, 735, 424, 592, 722, 956, 324};
        assertArrayEquals(expectedArr6, evenOddPartition.partitionEvenAndOdd(new int[]{137, 324, 424, 199, 735, 947, 592, 722, 956, 127}));

        int[] expectedArr7 = {7, 5, 3, 1, 8, 6, 4, 2};
        assertArrayEquals(expectedArr7, evenOddPartition.partitionEvenAndOdd(new int[]{2, 4, 6, 8, 1, 3, 5, 7}));

        int[] expectedArr8 = {1, 3, 95, 19, 73, 59, 94, 72, 4, 12};
        assertArrayEquals(expectedArr8, evenOddPartition.partitionEvenAndOdd(new int[]{1, 3, 4, 19, 73, 94, 59, 72, 95, 12}));

    }
}