package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class ShortestDistanceToCharTest {
    private ShortestDistanceToChar shortestDistanceToChar;

    @BeforeEach
    public void init() {
        shortestDistanceToChar = new ShortestDistanceToChar();
    }

    @Test
    void testGetShortestDistanceFromTargetChar() {
        int[] expectedResult1 = {4, 3, 2, 1, 0, 1, 0, 1, 2, 3};
        int[] actualResult1 = (int[]) shortestDistanceToChar.getShortestDistanceFromTargetChar("helloworld", 'o');
        assertArrayEquals(expectedResult1, actualResult1);

        int[] expectedResult2 = {1, 0, 0, 1, 2, 3, 3, 2, 1, 0, 0, 1, 2};
        int[] actualResult2 = (int[]) shortestDistanceToChar.getShortestDistanceFromTargetChar("geeksforgeeks", 'e');
        assertArrayEquals(expectedResult2, actualResult2);

        int[] expectedResult3 = {3, 2, 1, 0};
        int[] actualResult3 = (int[]) shortestDistanceToChar.getShortestDistanceFromTargetChar("aaab", 'b');
        assertArrayEquals(expectedResult3, actualResult3);

        int[] expectedResult4 = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        int[] actualResult4 = (int[]) shortestDistanceToChar.getShortestDistanceFromTargetChar("loveleetcode", 'e');
        assertArrayEquals(expectedResult4, actualResult4);

        int[] expectedResult5 = {0, 0, 0, 0, 0};
        int[] actualResult5 = (int[]) shortestDistanceToChar.getShortestDistanceFromTargetChar("rrrrr", 'r');
        assertArrayEquals(expectedResult5, actualResult5);
    }

    @Test
    void testGetShortestDistanceFromTargetCharOptimize() {
        int[] expectedResult1 = {4, 3, 2, 1, 0, 1, 0, 1, 2, 3};
        int[] actualResult1 = shortestDistanceToChar.getShortestDistanceFromTargetCharOptimize("helloworld", 'o');
        assertArrayEquals(expectedResult1, actualResult1);

        int[] expectedResult2 = {1, 0, 0, 1, 2, 3, 3, 2, 1, 0, 0, 1, 2};
        int[] actualResult2 = shortestDistanceToChar.getShortestDistanceFromTargetCharOptimize("geeksforgeeks", 'e');
        assertArrayEquals(expectedResult2, actualResult2);

        int[] expectedResult3 = {3, 2, 1, 0};
        int[] actualResult3 = shortestDistanceToChar.getShortestDistanceFromTargetCharOptimize("aaab", 'b');
        assertArrayEquals(expectedResult3, actualResult3);

        int[] expectedResult4 = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        int[] actualResult4 = shortestDistanceToChar.getShortestDistanceFromTargetCharOptimize("loveleetcode", 'e');
        assertArrayEquals(expectedResult4, actualResult4);

        int[] expectedResult5 = {0, 0, 0, 0, 0};
        int[] actualResult5 = shortestDistanceToChar.getShortestDistanceFromTargetCharOptimize("rrrrr", 'r');
        assertArrayEquals(expectedResult5, actualResult5);
    }
}