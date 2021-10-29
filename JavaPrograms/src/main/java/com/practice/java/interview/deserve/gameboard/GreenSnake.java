package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class GreenSnake implements MovePiece {
    protected Map<Integer, Integer> greenSnakeMap;
    private boolean hasBiteOnce;

    public GreenSnake() {
        greenSnakeMap = new HashMap<>();
        hasBiteOnce = false;
    }

    public void positionGreenSnake(int snakeHead, int snakeTail) {
        greenSnakeMap.put(snakeHead, snakeTail);
    }

    @Override
    public int getNewPosition(int snakeHead) {
        if (!hasBiteOnce) {
            if (greenSnakeMap.get(snakeHead) != null) {
                hasBiteOnce = true;
                return greenSnakeMap.get(snakeHead);
            }
        }
        return snakeHead;
    }
}
