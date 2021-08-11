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
        assertEquals(22, maxCheese.getMaxCheeseByMouse(new int[]{1, 2, 8, 10, 5, 7, 10}));   //24
        assertEquals(120, maxCheese.getMaxCheeseByMouse(new int[]{10, 20, 30, 40, 10, 20, 30, 40}));
        assertEquals(0, maxCheese.getMaxCheeseByMouse(new int[]{}));
        assertEquals(24, maxCheese.getMaxCheeseByMouse(new int[]{2, 4, 6, 8, 10, 12}));
        assertEquals(234, maxCheese.getMaxCheeseByMouse(new int[]{4, 5, 10, 8, 36, 75, 34, 45, 25, 10, 12, 5, 33, 65, 11, 22})); //236
    }
}