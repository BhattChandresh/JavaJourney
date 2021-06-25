package com.practice.java.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchDemoTest {

    @Test
    void binarySearch() {
        assertEquals(8, BinarySearchDemo.binarySearch(new int[]{3, 11, 21, 29, 41, 54, 61, 78, 110, 127}, 110));
    }
}