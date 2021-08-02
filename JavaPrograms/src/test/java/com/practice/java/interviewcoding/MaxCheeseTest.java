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
        assertEquals(22, maxCheese.getMaxCheeseByMouse(new int[]{1, 2, 8, 10, 5, 7, 10}));
        assertEquals(120, maxCheese.getMaxCheeseByMouse(new int[]{10, 20, 30, 40, 10, 20, 30, 40}));
    }
}