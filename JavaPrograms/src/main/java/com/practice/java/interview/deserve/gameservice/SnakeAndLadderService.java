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
        snakeAndLadderBoard.greenSnake.positionGreenSnake(58, 41);
        snakeAndLadderBoard.purpleSnake.positionPurpleSnake(40, 21);
    }

    public void startGame(int totalTurns, String playerName) {
        snakeAndLadderBoard.setPlayerInitialPosition(playerName);
        while (totalTurns > 0) {
            int diceRollNumber = diceService.getDiceNumber();
            System.out.println("--> Rolled Dice = " + diceRollNumber);
            movePlayer(diceRollNumber, snakeAndLadderBoard.player.getName());
            totalTurns -= 1;
            if (snakeAndLadderBoard.getPlayerPiece().get(playerName) == Constant.BOARD_SIZE) {
                System.out.println(playerName + " has won!, Ending the game");
                break;
            }
        }
    }

    public void movePlayer(int diceRollNumber, String playerName) {
        int originalPosition = snakeAndLadderBoard.getPlayerPiece().get(playerName);
        System.out.println("--> Original Position = " + originalPosition);
        int newPosition = originalPosition + diceRollNumber;

        if (newPosition > Constant.BOARD_SIZE) {
            newPosition = originalPosition;
        }

        newPosition = snakeAndLadderBoard.fetchSnakeTail(newPosition);
        newPosition = snakeAndLadderBoard.fetchLadderHead(newPosition);
        System.out.println(playerName + "  will be moved to = " + newPosition);
        snakeAndLadderBoard.getPlayerPiece().put(snakeAndLadderBoard.player.getName(), newPosition);
    }
}
