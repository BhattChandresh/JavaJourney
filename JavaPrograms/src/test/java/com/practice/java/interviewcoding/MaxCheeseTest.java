package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxCheeseTest {
    MaxCheese maxCheese;

    @BeforeEach
    public void init() {
        maxCheese = new MaxCheese();
    }

    @Test
    void testGetMaxCheeseByMouse() {
        assertEquals(113, maxCheese.getMaxCheeseByMouse(new int[]{8, 5, 10, 100, 10, 5}));
        assertEquals(4, maxCheese.getMaxCheeseByMouse(new int[]{1, 2, 3}));
        assertEquals(30, maxCheese.getMaxCheeseByMouse(new int[]{10, 10, 10, 10, 10}));
        assertEquals(24, maxCheese.getMaxCheeseByMouse(new int[]{1, 2, 8, 10, 5, 7, 10}));
        assertEquals(120, maxCheese.getMaxCheeseByMouse(new int[]{10, 20, 30, 40, 10, 20, 30, 40}));
        assertEquals(0, maxCheese.getMaxCheeseByMouse(new int[]{}));
        assertEquals(24, maxCheese.getMaxCheeseByMouse(new int[]{2, 4, 6, 8, 10, 12}));
        assertEquals(236, maxCheese.getMaxCheeseByMouse(new int[]{4, 5, 10, 8, 36, 75, 34, 45, 25, 10, 12, 5, 33, 65, 11, 22}));
        assertEquals(47, maxCheese.getMaxCheeseByMouse(new int[]{1, 5, 7, 10, 12, 15, 18, 6, 9, 4}));
        assertEquals(77, maxCheese.getMaxCheeseByMouse(new int[]{5, 12, 7, 20, 15, 10, 45}));
        assertEquals(119, maxCheese.getMaxCheeseByMouse(new int[]{3, 7, 12, 10, 45, 70, 30, 22, 11, 10}));
        assertEquals(116, maxCheese.getMaxCheeseByMouse(new int[]{12, 17, 42, 25, 30, 13, 5, 10, 27}));
        assertEquals(1280, maxCheese.getMaxCheeseByMouse(new int[]{235, 112, 436, 301, 512, 609}));
        assertEquals(2244, maxCheese.getMaxCheeseByMouse(new int[]{111, 211, 311, 511, 411, 711, 611, 811}));
        assertEquals(1358, maxCheese.getMaxCheeseByMouse(new int[]{115, 200, 415, 306, 720, 521, 108, 98}));
    }
}








