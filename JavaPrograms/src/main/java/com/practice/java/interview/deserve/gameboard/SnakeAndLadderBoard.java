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

    public SnakeAndLadderBoard(int boardSize) {
        this.boardSize = boardSize;
        playerPiece = new HashMap<>();
        player = new Player();
        snake = new Snake();
        ladder = new Ladder();
        greenSnake = new GreenSnake();
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
        if(snake.snakeMap.containsKey(snakeHead)) {
            return snake.getNewPosition(snakeHead);
        } else if(greenSnake.greenSnakeMap.containsKey(snakeHead)) {
            return greenSnake.getNewPosition(snakeHead);
        }
        return snakeHead;
    }

    public int fetchLadderHead(int ladderTail) {
        if(ladder.ladderMap.containsKey(ladderTail)) {
            return ladder.getNewPosition(ladderTail);
        }
        return ladderTail;
    }
}
