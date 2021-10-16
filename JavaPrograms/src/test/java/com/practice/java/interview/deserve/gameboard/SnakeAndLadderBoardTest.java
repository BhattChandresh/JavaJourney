package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeAndLadderBoardTest {
    private SnakeAndLadderBoard snakeAndLadderBoard;
    private static final int BOARD_SIZE = 100;

    @BeforeEach
    public void init() {
        snakeAndLadderBoard = new SnakeAndLadderBoard(BOARD_SIZE);
    }

    @Test
    void testGetBoardSize() {
        assertEquals(100, snakeAndLadderBoard.getBoardSize());
    }

    @Test
    void testSetInitialPositionPlayer() {
        snakeAndLadderBoard.setPlayerInitialPosition("RedPiece_Player1");
        Map<String, Integer> map = snakeAndLadderBoard.getPlayerPiece();
        map.forEach((name, initialPosition) -> {
            assertEquals("RedPiece_Player1", name);
            assertEquals(Integer.valueOf("0"), initialPosition);
        });
    }
}