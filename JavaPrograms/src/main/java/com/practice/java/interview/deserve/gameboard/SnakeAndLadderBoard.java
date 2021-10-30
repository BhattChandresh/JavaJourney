package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadderBoard {
    private final int boardSize;
    private final Map<String, Integer> playerPiece;
    public Player player;
    public Snake snake;
    public Ladder ladder;
    public GreenSnake greenSnake;
    public PurpleSnake purpleSnake;
    public MagicLadder magicLadder;

    public SnakeAndLadderBoard(int boardSize) {
        this.boardSize = boardSize;
        playerPiece = new HashMap<>();
        player = new Player();
        snake = new Snake();
        ladder = new Ladder();
        greenSnake = new GreenSnake();
        purpleSnake = new PurpleSnake();
        magicLadder = new MagicLadder();
    }

    public int getBoardSize() {
        return boardSize;
    }

    public Map<String, Integer> getPlayerPiece() {
        return playerPiece;
    }

    public void setPlayerInitialPosition(String playerName) {
        player.setName(playerName);
        playerPiece.put(player.getName(), 0);
    }

    public int fetchSnakeTail(int snakeHead) {
        if (snake.snakeMap.containsKey(snakeHead)) {
            return snake.getNewPosition(snakeHead);
        } else if (greenSnake.greenSnakeMap.containsKey(snakeHead)) {
            return greenSnake.getNewPosition(snakeHead);
        } else if (purpleSnake.purpleSnakeMap.containsKey(snakeHead)) {
            return purpleSnake.getNewPosition(snakeHead);
        }
        return snakeHead;
    }

    public int fetchLadderHead(int ladderTail) {
        if (ladder.ladderMap.containsKey(ladderTail)) {
            return ladder.getNewPosition(ladderTail);
        } else if (magicLadder.magicLadderMap.containsKey(ladderTail)) {
            return magicLadder.getNewPosition(ladderTail);
        }
        return ladderTail;
    }
}
