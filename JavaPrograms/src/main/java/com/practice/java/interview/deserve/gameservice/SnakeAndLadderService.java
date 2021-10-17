package com.practice.java.interview.deserve.gameservice;

import com.practice.java.interview.deserve.dice.NormalDiceService;
import com.practice.java.interview.deserve.gameboard.SnakeAndLadderBoard;

public class SnakeAndLadderService {
    public static final int BOARD_SIZE = 100;
    protected SnakeAndLadderBoard snakeAndLadderBoard;
    protected NormalDiceService normalDiceService;

    public SnakeAndLadderService() {
        snakeAndLadderBoard = new SnakeAndLadderBoard(BOARD_SIZE);
        normalDiceService = new NormalDiceService();
        snakeAndLadderBoard.snake.setDefaultSnakeHeadAndTailPosition();
        snakeAndLadderBoard.ladder.setDefaultLadderStartAndEndPosition();
    }

    //TODO: Remove all the System.out.println() statements.

    //TODO : System.out.println statement should be removed.
    public void startGame(int totalTurns, String playerName) {
        snakeAndLadderBoard.setPlayerInitialPosition(playerName);
        while (totalTurns > 0) {
            int diceRollNumber = normalDiceService.getDiceNumber();
            System.out.println("New Roll out Number = " + diceRollNumber);
            movePlayer(diceRollNumber, snakeAndLadderBoard.player.getName());
            totalTurns -= 1;
        }
    }

    //TODO : System.out.println statement should be removed.
    public void movePlayer(int diceRollNumber, String playerName) {
        int originalPosition = snakeAndLadderBoard.getPlayerPiece().get(playerName);
        int newPosition = originalPosition + diceRollNumber;

        if (newPosition > BOARD_SIZE) {
            newPosition = originalPosition;
        }

        if (newPositionAfterGoingThroughSnake(newPosition) != 0) {
            newPosition = snakeAndLadderBoard.snake.getSnakeTail(newPosition);
        }

        if (newPositionAfterGoingThroughLadder(newPosition) != 0) {
            newPosition = snakeAndLadderBoard.ladder.getLadderHead(newPosition);
        }

        System.out.println("Player will be moved to = " + newPosition);
        snakeAndLadderBoard.getPlayerPiece().put(snakeAndLadderBoard.player.getName(), newPosition);
    }

    public int newPositionAfterGoingThroughLadder(int newPosition) {
        System.out.println("#####   Ladder Head = " + snakeAndLadderBoard.ladder.getLadderHead(newPosition));
        return snakeAndLadderBoard.ladder.getLadderHead(newPosition);
    }

    public int newPositionAfterGoingThroughSnake(int newPosition) {
        System.out.println("#####   Snake Tail = " + snakeAndLadderBoard.snake.getSnakeTail(newPosition));
        return snakeAndLadderBoard.snake.getSnakeTail(newPosition);
    }
}
