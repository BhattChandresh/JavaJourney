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
        assertEquals(3, snake.getSnakeTail(25));
        snake.setSnakeHeadAndTailDynamically(14, 7);
        assertEquals(7, snake.getSnakeTail(14));
        assertEquals(73, snake.getSnakeTail(91));
    }

    @Test
    void testGetSnakeTail_When_NoSnake_Present() {
        assertEquals(0, snake.getSnakeTail(51));
        assertEquals(0, snake.getSnakeTail(97));
    }
}