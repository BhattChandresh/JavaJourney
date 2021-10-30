package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PurpleSnakeTest {
    private PurpleSnake purpleSnake;

    @BeforeEach
    public void init() {
        purpleSnake = new PurpleSnake();
        purpleSnake.positionPurpleSnake(40, 21);
    }

    @Test
    void testGetNewPosition_When_SnakeBiteTwice() {
        assertEquals(21, purpleSnake.getNewPosition(40));
        assertEquals(21, purpleSnake.getNewPosition(40));
    }

    @Test
    void testGetNewPosition_When_SnakeBite_MoreThan_Twice() {
        assertEquals(21, purpleSnake.getNewPosition(40));
        assertEquals(21, purpleSnake.getNewPosition(40));
        assertEquals(40, purpleSnake.getNewPosition(40));
        assertEquals(40, purpleSnake.getNewPosition(40));
    }
}