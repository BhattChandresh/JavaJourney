package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayTripletTest {
    private ArrayTriplet arrayTriplet;
    private List<int[]> triplets;

    @BeforeEach
    public void init() {
        arrayTriplet = new ArrayTriplet();
        triplets = new ArrayList<>();
    }

    @Test
    void testGetArrayTripletBruteForce() {
        int[] arr1 = {7, 5, 0};
        int[] arr2 = {9, 3, 0};
        triplets.add(arr1);
        triplets.add(arr2);
        assertEquals(Arrays.toString(triplets.get(0)), Arrays.toString(arrayTriplet.getArrayTripletBruteForce(new int[]{7, 5, 9, 3, 0, 8, 6}, 12).get(0)));
        assertEquals(Arrays.toString(triplets.get(1)), Arrays.toString(arrayTriplet.getArrayTripletBruteForce(new int[]{7, 5, 9, 3, 0, 8, 6}, 12).get(1)));
        triplets.clear();
        arrayTriplet.clearTripletsList();

        int[] arr3 = {17, 51, 21};
        int[] arr4 = {17, 39, 33};
        int[] arr5 = {39, 29, 21};
        triplets.add(arr3);
        triplets.add(arr4);
        triplets.add(arr5);
        assertEquals(Arrays.toString(triplets.get(0)), Arrays.toString(arrayTriplet.getArrayTripletBruteForce(new int[]{17, 51, 39, 29, 33, 21, 65}, 89).get(0)));
        assertEquals(Arrays.toString(triplets.get(1)), Arrays.toString(arrayTriplet.getArrayTripletBruteForce(new int[]{17, 51, 39, 29, 33, 21, 65}, 89).get(1)));
        assertEquals(Arrays.toString(triplets.get(2)), Arrays.toString(arrayTriplet.getArrayTripletBruteForce(new int[]{17, 51, 39, 29, 33, 21, 65}, 89).get(2)));
    }
}