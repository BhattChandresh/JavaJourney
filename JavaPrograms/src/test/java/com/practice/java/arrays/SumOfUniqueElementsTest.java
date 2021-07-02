package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfUniqueElementsTest {
    private SumOfUniqueElements sumOfUniqueElements;

    @BeforeEach
    public void init() {
        sumOfUniqueElements = new SumOfUniqueElements();
    }

    @Test
    void testGetSumOfUniqueElementsByMap() {
        assertEquals(15, sumOfUniqueElements.getSumOfUniqueElementsByMap(new int[]{1, 2, 3, 4, 5}));
        assertEquals(4, sumOfUniqueElements.getSumOfUniqueElementsByMap(new int[]{1, 2, 3, 2}));
        assertEquals(0, sumOfUniqueElements.getSumOfUniqueElementsByMap(new int[]{1, 1, 1, 1, 1}));
        assertEquals(37, sumOfUniqueElements.getSumOfUniqueElementsByMap(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9}));
        assertEquals(17, sumOfUniqueElements.getSumOfUniqueElementsByMap(new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 8, 8, 10}));
    }
}