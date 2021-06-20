package com.practice.java.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WaterContainerTest {
    private WaterContainer waterContainer;

    @BeforeEach
    public void init() {
        waterContainer = new WaterContainer();
    }

    @Test
    void testFindMaxArea() {
        assertEquals(28, waterContainer.getMaxWaterContainerBruteForce(new int[]{7, 1, 2, 3, 9}));
        assertEquals(0, waterContainer.getMaxWaterContainerBruteForce(new int[]{}));
        assertEquals(0, waterContainer.getMaxWaterContainerBruteForce(new int[]{34}));
        assertEquals(32, waterContainer.getMaxWaterContainerBruteForce(new int[]{6, 9, 2, 4, 5, 8}));
        assertEquals(10, waterContainer.getMaxWaterContainerBruteForce(new int[]{10, 20}));
    }

    @Test
    void testFindLength() {
        assertEquals(4, waterContainer.findLength(4, 5));
        assertEquals(45, waterContainer.findLength(50, 45));
    }

    @Test
    void testFindWidth() {
        assertEquals(3, waterContainer.findWidth(7, 10));
        assertEquals(5, waterContainer.findWidth(20, 15));
    }
}