package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllDuplicatesInArrayTest {
    FindAllDuplicatesInArray findAllDuplicatesInArray;

    @BeforeEach
    public void init() {
        findAllDuplicatesInArray = new FindAllDuplicatesInArray();
    }

    @Test
    void testGetAllDuplicateElementsTraditionalApproach() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsTraditionalApproach(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

        list.clear();
        list.add(1);
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsTraditionalApproach(new int[]{1, 1, 2}));

        list.clear();
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsTraditionalApproach(new int[]{1}));
    }

    @Test
    void testGetAllDuplicateElementsFunctionalApproach() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsFunctionalApproach(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

        list.clear();
        list.add(1);
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsFunctionalApproach(new int[]{1, 1, 2}));

        list.clear();
        assertEquals(list, findAllDuplicatesInArray.getAllDuplicateElementsFunctionalApproach(new int[]{1}));
    }

}