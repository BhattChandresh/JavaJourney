package com.practice.java.InterviewCoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PascalTriangleTest {
    PascalTriangle pascalTriangle;

    @BeforeEach
    public void init() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    void testPreparePascalTriangle() {
        List<Integer> row1 = Arrays.asList(1);
        List<Integer> row2 = Arrays.asList(1, 1);
        List<Integer> row3 = Arrays.asList(1, 2, 1);
        List<Integer> row4 = Arrays.asList(1, 3, 3, 1);
        List<Integer> row5 = Arrays.asList(1, 4, 6, 4, 1);
        List<Integer> row6 = Arrays.asList(1, 5, 10, 10, 5, 1);
        List<Integer> row7 = Arrays.asList(1, 6, 15, 20, 15, 6, 1);
        List<Integer> row8 = Arrays.asList(1, 7, 21, 35, 35, 21, 7, 1);
        List<Integer> row9 = Arrays.asList(1, 8, 28, 56, 70, 56, 28, 8, 1);
        List<Integer> row10 = Arrays.asList(1, 9, 36, 84, 126, 126, 84, 36, 9, 1);
        List<List<Integer>> allRows = new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);
        allRows.add(row4);
        allRows.add(row5);
        allRows.add(row6);
        allRows.add(row7);
        allRows.add(row8);
        allRows.add(row9);
        allRows.add(row10);
        assertEquals(allRows, pascalTriangle.preparePascalTriangle(10));
    }
}