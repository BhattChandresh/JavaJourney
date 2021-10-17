package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class Snake {
    private final Map<Integer, Integer> snakeMap;

    public Snake() {
        snakeMap = new HashMap<>();
    }

    public void setSnakeHeadAndTailDynamically(int head, int tail) {
        snakeMap.put(head, tail);
    }

    public void setDefaultSnakeHeadAndTailPosition() {
        snakeMap.put(25, 3);
        snakeMap.put(56, 48);
        snakeMap.put(59, 1);
        snakeMap.put(69, 32);
        snakeMap.put(83, 57);
        snakeMap.put(91, 73);
        snakeMap.put(94, 26);
        snakeMap.put(99, 80);
    }

    public int getSnakeTail(int snakeHead) {
        if (snakeMap.get(snakeHead) != null) {
            return snakeMap.get(snakeHead);
        }
        return 0;
    }
}
