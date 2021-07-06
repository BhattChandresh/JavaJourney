package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RowOfPascalTriangleTest {
    private RowOfPascalTriangle rowOfPascalTriangle;

    @BeforeEach
    public void init() {
        rowOfPascalTriangle = new RowOfPascalTriangle();
    }

    @Test
    void testGetRowOfPascalTriangle() {
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
        assertEquals(row1, rowOfPascalTriangle.getRowOfPascalTriangle(0));
        assertEquals(row10, rowOfPascalTriangle.getRowOfPascalTriangle(9));
        assertEquals(row5, rowOfPascalTriangle.getRowOfPascalTriangle(4));
        assertEquals(row6, rowOfPascalTriangle.getRowOfPascalTriangle(5));
        assertEquals(row2, rowOfPascalTriangle.getRowOfPascalTriangle(1));
        assertEquals(row3, rowOfPascalTriangle.getRowOfPascalTriangle(2));
        assertEquals(row9, rowOfPascalTriangle.getRowOfPascalTriangle(8));
        assertEquals(row4, rowOfPascalTriangle.getRowOfPascalTriangle(3));
        assertEquals(row7, rowOfPascalTriangle.getRowOfPascalTriangle(6));
        assertEquals(row8, rowOfPascalTriangle.getRowOfPascalTriangle(7));
    }
}