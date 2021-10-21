package com.practice.java.interview.deserve.gameservice;

import com.practice.java.interview.deserve.dice.DiceService;
import com.practice.java.interview.deserve.gameboard.Constant;
import com.practice.java.interview.deserve.gameboard.SnakeAndLadderBoard;

public class SnakeAndLadderService {
    protected SnakeAndLadderBoard snakeAndLadderBoard;
    protected DiceService diceService;

    public SnakeAndLadderService() {
        snakeAndLadderBoard = new SnakeAndLadderBoard(Constant.BOARD_SIZE);
        diceService = new DiceService();
        snakeAndLadderBoard.snake.setDefaultSnakeHeadAndTailPosition();
        snakeAndLadderBoard.ladder.setDefaultLadderStartAndEndPosition();
    }

    public void startGame(int totalTurns, String playerName) {
        snakeAndLadderBoard.setPlayerInitialPosition(playerName);
        while (totalTurns > 0) {
            int diceRollNumber = diceService.getDiceNumber();
            movePlayer(diceRollNumber, snakeAndLadderBoard.player.getName());
            totalTurns -= 1;
        }
    }

    public void movePlayer(int diceRollNumber, String playerName) {
        int originalPosition = snakeAndLadderBoard.getPlayerPiece().get(playerName);
        int newPosition = originalPosition + diceRollNumber;

        if (newPosition > Constant.BOARD_SIZE) {
            newPosition = originalPosition;
        }

        if (newPositionAfterGoingThroughSnake(newPosition) != 0) {
            newPosition = snakeAndLadderBoard.snake.getSnakeTail(newPosition);
        }

        if (newPositionAfterGoingThroughLadder(newPosition) != 0) {
            newPosition = snakeAndLadderBoard.ladder.getLadderHead(newPosition);
        }

        System.out.println(playerName + "  will be moved to = " + newPosition);
        snakeAndLadderBoard.getPlayerPiece().put(snakeAndLadderBoard.player.getName(), newPosition);
    }

    public int newPositionAfterGoingThroughLadder(int newPosition) {
        return snakeAndLadderBoard.ladder.getLadderHead(newPosition);
    }

    public int newPositionAfterGoingThroughSnake(int newPosition) {
        return snakeAndLadderBoard.snake.getSnakeTail(newPosition);
    }
}
