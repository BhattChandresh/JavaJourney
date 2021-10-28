package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SnakeTest {
    private Snake snake;

    @BeforeEach
    public void init() {
        snake = new Snake();
        snake.setDefaultSnakeHeadAndTailPosition();
    }

    @Test
    void testGetSnakeTail_Valid_Tail() {
        assertEquals(3, snake.getNewPosition(25));
        snake.setSnakeHeadAndTailDynamically(14, 7);
        assertEquals(7, snake.getNewPosition(14));
        assertEquals(73, snake.getNewPosition(91));
    }

    @Test
    void testGetSnakeTail_When_NoSnake_Present() {
        assertEquals(51, snake.getNewPosition(51));
        assertEquals(97, snake.getNewPosition(97));
    }
}