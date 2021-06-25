package com.practice.java.arrays;

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
        assertEquals(49, waterContainer.getMaxWaterContainerBruteForce(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}