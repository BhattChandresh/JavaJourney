package com.practice.java.interview.deserve.gameservice;

import com.practice.java.interview.deserve.gameboard.Constant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeAndLadderServiceTest {
    private SnakeAndLadderService snakeAndLadderService;

    @BeforeEach
    public void init() {
        snakeAndLadderService = new SnakeAndLadderService();
    }

    //This is kind of Functional Test.
    @Test
    void startGame() {
        snakeAndLadderService.startGame(Constant.TOTAL_TURNS, "Player1");
    }

    @Test
    void testMovePlayer_Moves_0_To_100() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("RedPiece_Player1");
        snakeAndLadderService.movePlayer(5, "RedPiece_Player1");
        assertEquals(Integer.valueOf("5"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
        snakeAndLadderService.movePlayer(6, "RedPiece_Player1");
        assertEquals(Integer.valueOf("11"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
    }

    // Test that is dice position is above upper bound (100) then piece should not move and stationed at the original position.
    @Test
    void testMovePlayer_Above_100() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("RedPiece_Player1");
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("RedPiece_Player1", 98);
        snakeAndLadderService.movePlayer(3, "RedPiece_Player1");
        assertEquals(Integer.valueOf("98"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
    }

    //Test that upper bound should reach if, dice roll out number is fine.
    @Test
    void testMovePlayer_When_Player_Reach_Exactly_At_100() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("RedPiece_Player1");
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("RedPiece_Player1", 98);
        snakeAndLadderService.movePlayer(2, "RedPiece_Player1");
        assertEquals(Integer.valueOf("100"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("RedPiece_Player1"));
    }

    @Test
    void testFetchSnakeTail_When_There_Snake() {
        snakeAndLadderService.snakeAndLadderBoard.snake.setSnakeHeadAndTailDynamically(14, 7);
        assertEquals(7, snakeAndLadderService.snakeAndLadderBoard.fetchSnakeTail(14));
        assertEquals(32, snakeAndLadderService.snakeAndLadderBoard.fetchSnakeTail(69));
    }

    @Test
    void testFetchSnakeTail_When_No_Snake() {
        snakeAndLadderService.snakeAndLadderBoard.snake.setSnakeHeadAndTailDynamically(14, 7);
        assertEquals(97, snakeAndLadderService.snakeAndLadderBoard.fetchSnakeTail(97));
    }

    @Test
    void testFetchLadderHead_When_There_Ladder() {
        snakeAndLadderService.snakeAndLadderBoard.ladder.setLadderDynamically(45, 57);
        assertEquals(57, snakeAndLadderService.snakeAndLadderBoard.fetchLadderHead(45));
        assertEquals(84, snakeAndLadderService.snakeAndLadderBoard.fetchLadderHead(28));
    }

    @Test
    void testNewPosition_When_No_Ladder() {
        snakeAndLadderService.snakeAndLadderBoard.ladder.setLadderDynamically(45, 57);
        assertEquals(86, snakeAndLadderService.snakeAndLadderBoard.fetchLadderHead(86));
    }

    @Test
    void testGreenSnakeFunctionality() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("P1");
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P1", 55);
        snakeAndLadderService.movePlayer(3, "P1");
        assertEquals(Integer.valueOf("41"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P1", 55);
        snakeAndLadderService.movePlayer(3, "P1");
        assertEquals(Integer.valueOf("58"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
        snakeAndLadderService.movePlayer(2, "P1");
        assertEquals(Integer.valueOf("60"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
    }

    @Test
    void testPurpleSnakeFunctionality() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("P1");
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P1", 39);
        snakeAndLadderService.movePlayer(1, "P1");
        assertEquals(Integer.valueOf("21"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P1", 35);
        snakeAndLadderService.movePlayer(5, "P1");
        assertEquals(Integer.valueOf("21"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P1", 37);
        snakeAndLadderService.movePlayer(3, "P1");
        assertEquals(Integer.valueOf("40"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
        snakeAndLadderService.movePlayer(4, "P1");
        assertEquals(Integer.valueOf("44"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P1"));
    }

    @Test
    void testMagicLadderFunctionality() {
        snakeAndLadderService.snakeAndLadderBoard.setPlayerInitialPosition("P2");
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P2", 8);
        snakeAndLadderService.movePlayer(2, "P2");
        assertEquals(Integer.valueOf("100"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P2"));
        snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().put("P2", 5);
        snakeAndLadderService.movePlayer(5, "P2");
        assertEquals(Integer.valueOf("10"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P2"));
        snakeAndLadderService.movePlayer(5, "P2");
        assertEquals(Integer.valueOf("15"), snakeAndLadderService.snakeAndLadderBoard.getPlayerPiece().get("P2"));
    }
}