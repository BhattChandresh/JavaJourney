package com.practice.java.datastructure.reorderlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ListUtilsTest {
    private ListUtils reorderList;

    @BeforeEach
    public void init() {
        reorderList = new ListUtils();
    }

    @Test
    void testReorderListWorkingSolution() {
        int[] inputArr1 = {1, 2, 3, 4};
        reorderList.prepareList(inputArr1);
        reorderList.reorderListWorkingSolution(reorderList.getHead());
        assertEquals(Arrays.asList(1, 4, 2, 3), reorderList.getNodeValuesForTesting());
        reorderList.deleteAllNodes();
        reorderList.desiredList.clear();

        int[] inputArr2 = {1, 2, 3, 4, 5};
        reorderList.prepareList(inputArr2);
        reorderList.reorderListWorkingSolution(reorderList.getHead());
        assertEquals(Arrays.asList(1, 5, 2, 4, 3), reorderList.getNodeValuesForTesting());
        reorderList.deleteAllNodes();
        reorderList.desiredList.clear();

        int[] inputArr3 = {35, 44, 56, 12, 99, 201, 5};
        reorderList.prepareList(inputArr3);
        reorderList.reorderListWorkingSolution(reorderList.getHead());
        assertEquals(Arrays.asList(35, 5, 44, 201, 56, 99, 12), reorderList.getNodeValuesForTesting());
        reorderList.deleteAllNodes();
        reorderList.desiredList.clear();

        int[] inputArr4 = {15, 30, 45, 60, 75, 90, 105, 120, 135, 150};
        reorderList.prepareList(inputArr4);
        reorderList.reorderListWorkingSolution(reorderList.getHead());
        assertEquals(Arrays.asList(15, 150, 30, 135, 45, 120, 60, 105, 75, 90), reorderList.getNodeValuesForTesting());
        reorderList.deleteAllNodes();
        reorderList.desiredList.clear();

        int[] inputArr5 = {2, 4, 8, 16, 32, 64, 128, 512, 1024, 2048, 4096, 8192, 16384};
        reorderList.prepareList(inputArr5);
        reorderList.reorderListWorkingSolution(reorderList.getHead());
        assertEquals(Arrays.asList(2, 16384, 4, 8192, 8, 4096, 16, 2048, 32, 1024, 64, 512, 128), reorderList.getNodeValuesForTesting());
        reorderList.deleteAllNodes();
        reorderList.desiredList.clear();

    }
}