package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class PurpleSnake implements MovePiece {
    protected Map<Integer, Integer> purpleSnakeMap;
    private int biteCount;

    public PurpleSnake() {
        purpleSnakeMap = new HashMap<>();
        biteCount = 0;
    }

    public void positionPurpleSnake(int snakeHead, int snakeTail) {
        purpleSnakeMap.put(snakeHead, snakeTail);
    }

    @Override
    public int getNewPosition(int snakeHead) {
        if (biteCount < 2) {
            if (purpleSnakeMap.get(snakeHead) != null) {
                biteCount += 1;
                return purpleSnakeMap.get(snakeHead);
            }
        }
        return snakeHead;
    }
}
