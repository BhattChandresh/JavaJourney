package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadderBoard {
    private final int boardSize;
    private final Map<String, Integer> playerPiece;
    public Player player;
    public Snake snake;

    public SnakeAndLadderBoard(int boardSize) {
        this.boardSize = boardSize;
        playerPiece = new HashMap<>();
        player = new Player();
        snake = new Snake();
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
}
