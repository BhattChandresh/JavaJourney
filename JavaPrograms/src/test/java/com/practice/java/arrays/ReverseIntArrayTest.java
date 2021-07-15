package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseIntArrayTest {
    private ReverseIntArray reverseIntArray;

    @BeforeEach
    public void init() {
        reverseIntArray = new ReverseIntArray();
    }

    @Test
    void testReverseArray() {
        assertArrayEquals(new int[]{10, 9, 8, 5, 4}, reverseIntArray.reverseArray(new int[]{4, 5, 8, 9, 10}));
        assertArrayEquals(new int[]{7, 33, 17, 21, 9, 12}, reverseIntArray.reverseArray(new int[]{12, 9, 21, 17, 33, 7}));
        assertArrayEquals(new int[]{555, 476, 343, 187, 921, 569, 891}, reverseIntArray.reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555}));
    }
}