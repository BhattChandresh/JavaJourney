package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementTest {
    private KthLargestElement kthLargestElement;

    @BeforeEach
    public void init() {
        kthLargestElement = new KthLargestElement();
    }

    @Test
    void testGetKthLargestElementBySoring() {
        assertEquals(7, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 3));
        assertEquals(10, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 4));
        assertEquals(3, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 1));
        assertEquals(15, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 5));
        assertEquals(4, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 2));
        assertEquals(20, kthLargestElement.getKthLargestElementBySoring(new int[]{7, 10, 4, 3, 20, 15}, 6));
    }
}