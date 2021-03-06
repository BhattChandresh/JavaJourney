package com.practice.java.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoArrsAndRemoveDuplicatesTest {
    private MergeTwoArrsAndRemoveDuplicates mergeTwoArrsAndRemoveDuplicates;

    @BeforeEach
    void setUp() {
        mergeTwoArrsAndRemoveDuplicates = new MergeTwoArrsAndRemoveDuplicates();
    }

    @Test
    void testMergeArrAndRemoveDuplicate() {
        int[] source1 = {1, 4, 5, 9, 10, 3};
        int[] source2 = {2, 3, 5, 6, 7, 10, 11, 6, 9};
        int[] destination = {1, 4, 5, 9, 10, 3, 2, 6, 7, 11};
        int[] result = mergeTwoArrsAndRemoveDuplicates.mergeArrAndRemoveDuplicate(source1, source2);
        assertArrayEquals(destination, result);
    }
}