package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumTest {

    private CombinationSum combinationSum;
    private List<Integer> list;
    private List<List<Integer>> result;
    private List<List<Integer>> combination;

    @BeforeEach
    public void init() {
        combinationSum = new CombinationSum();
        list = new ArrayList<>();
        result = new ArrayList<>();
        combination = new ArrayList<>();
    }

    @Test
    void testGetCombinationSum() {
        combination = combinationSum.getCombinationSum(new int[]{2, 3, 5}, 8, 0, list, result);
        assertEquals(3, combination.size());
        assertEquals(Arrays.asList(2, 2, 2, 2), combination.get(0));
        assertEquals(Arrays.asList(2, 3, 3), combination.get(1));
        assertEquals(Arrays.asList(3, 5), combination.get(2));

        clearAllList();
        combination = combinationSum.getCombinationSum(new int[]{2, 3, 6, 7}, 7, 0, list, result);
        assertEquals(2, combination.size());
        assertEquals(Arrays.asList(2, 2, 3), combination.get(0));
        assertEquals(Arrays.asList(7), combination.get(1));

        clearAllList();
        combination = combinationSum.getCombinationSum(new int[]{2}, 1, 0, list, result);
        assertEquals(0, combination.size());

        clearAllList();
        combination = combinationSum.getCombinationSum(new int[]{1}, 2, 0, list, result);
        assertEquals(1, combination.size());
        assertEquals(Arrays.asList(1, 1), combination.get(0));

        clearAllList();
        combination = combinationSum.getCombinationSum(new int[]{2, 4, 6, 8}, 8, 0, list, result);
        assertEquals(5, combination.size());
        assertEquals(Arrays.asList(2, 2, 2, 2), combination.get(0));
        assertEquals(Arrays.asList(2, 2, 4), combination.get(1));
        assertEquals(Arrays.asList(2, 6), combination.get(2));
        assertEquals(Arrays.asList(4, 4), combination.get(3));
        assertEquals(Arrays.asList(8), combination.get(4));
    }


    private void clearAllList() {
        combination.clear();
        result.clear();
        combination.clear();
    }
}