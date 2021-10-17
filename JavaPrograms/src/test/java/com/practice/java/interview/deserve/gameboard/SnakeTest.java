package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SnakeTest {
    private Snake snake;

    @BeforeEach
    public void init() {
        snake = new Snake();
        snake.setSnakeHeadAndTailPosition();
    }

    @Test
    void testGetSnakeTail() {
        assertEquals(3, snake.getSnakeTail(25));
        snake.setSnakeHeadAndTailDynamically(14, 7);
        assertEquals(7, snake.getSnakeTail(14));
        assertEquals(73, snake.getSnakeTail(91));
        assertEquals(0, snake.getSnakeTail(51));
    }
}