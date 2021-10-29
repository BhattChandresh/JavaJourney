package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreenSnakeTest {
    private GreenSnake greenSnake;

    @BeforeEach
    public void init() {
        greenSnake = new GreenSnake();
        greenSnake.positionGreenSnake(58, 41);
    }

    @Test
    void testGetNewPosition_FirstBite() {
        assertEquals(41, greenSnake.getNewPosition(58));
    }

    @Test
    void testGetNewPosition_SecondBite() {
        assertEquals(41, greenSnake.getNewPosition(58));
        assertEquals(58, greenSnake.getNewPosition(58));
    }
}