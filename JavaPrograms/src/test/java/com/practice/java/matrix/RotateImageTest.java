package com.practice.java.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateImageTest {

    private RotateImage rotateImage;

    @BeforeEach
    public void init() {
        rotateImage = new RotateImage();

    }

    @Test
    void testRotateImageBy90Degree() {
        int[][] expectedResult1 = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        String str1 = Arrays.toString(expectedResult1[0]);
        String str2 = Arrays.toString(expectedResult1[1]);
        String str3 = Arrays.toString(expectedResult1[2]);

        int[][] actual1 = rotateImage.rotateImageBy90Degree(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        assertEquals(str1, Arrays.toString(actual1[0]));
        assertEquals(str2, Arrays.toString(actual1[1]));
        assertEquals(str3, Arrays.toString(actual1[2]));

    }
}