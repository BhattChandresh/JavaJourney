package com.practice.java.interview.deserve.gameservice;

import com.practice.java.interview.deserve.SnakeAndLadderApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeAndLadderServiceTest {
    private SnakeAndLadderService snakeAndLadderService;

    @BeforeEach
    public void init() {
        snakeAndLadderService = new SnakeAndLadderService();
    }

    @Test
    void startGame() {
        snakeAndLadderService.startGame(SnakeAndLadderApp.TOTAL_TURNS, "Player1");
    }

    @Test
    void testMovePlayer() {
        //Normal Test cases
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("RedPiece_Player1");
        snakeAndLadderService.movePlayer(5, "RedPiece_Player1");
        assertEquals(Integer.valueOf("5"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
        snakeAndLadderService.movePlayer(6, "RedPiece_Player1");
        assertEquals(Integer.valueOf("11"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));

        // Test that is dice position is above upper bound (100) then piece should not move and stationed at the original position.
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("RedPiece_Player1", 98);
        snakeAndLadderService.movePlayer(3, "RedPiece_Player1");
        assertEquals(Integer.valueOf("98"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));

        //Test that  upper bound should reach if, dice roll out number is fine.
        snakeAndLadderService.movePlayer(2, "RedPiece_Player1");
        assertEquals(Integer.valueOf("100"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
    }

    @Test
    void testNewPositionAfterGoingThroughSnakeAndLadder() {
        snakeAndLadderService.snakeAndLadderBoard.snake.setSnakeHeadAndTailPosition();
        snakeAndLadderService.snakeAndLadderBoard.snake.setSnakeHeadAndTailDynamically(14, 7);

        assertEquals(7, snakeAndLadderService.newPositionAfterGoingThroughSnakeAndLadder(14));
        assertEquals(32, snakeAndLadderService.newPositionAfterGoingThroughSnakeAndLadder(69));
        assertEquals(0, snakeAndLadderService.newPositionAfterGoingThroughSnakeAndLadder(97));
    }
}