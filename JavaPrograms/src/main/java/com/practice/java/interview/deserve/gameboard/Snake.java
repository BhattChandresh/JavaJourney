package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class Snake implements MovePiece {
    protected final Map<Integer, Integer> snakeMap;

    public Snake() {
        snakeMap = new HashMap<>();
    }

    public void setSnakeHeadAndTailDynamically(int head, int tail) {
        snakeMap.put(head, tail);
    }

    public void setDefaultSnakeHeadAndTailPosition() {
        snakeMap.put(Constant.SNAKE_1_HEAD, Constant.SNAKE_1_TAIL);
        snakeMap.put(Constant.SNAKE_2_HEAD, Constant.SNAKE_2_TAIL);
        snakeMap.put(Constant.SNAKE_3_HEAD, Constant.SNAKE_3_TAIL);
        snakeMap.put(Constant.SNAKE_4_HEAD, Constant.SNAKE_4_TAIL);
        snakeMap.put(Constant.SNAKE_5_HEAD, Constant.SNAKE_5_TAIL);
        snakeMap.put(Constant.SNAKE_6_HEAD, Constant.SNAKE_6_TAIL);
        snakeMap.put(Constant.SNAKE_7_HEAD, Constant.SNAKE_7_TAIL);
        snakeMap.put(Constant.SNAKE_8_HEAD, Constant.SNAKE_8_TAIL);
    }

    @Override
    public int getNewPosition(int snakeHead) {
        if (snakeMap.get(snakeHead) != null) {
            return snakeMap.get(snakeHead);
        }
        return snakeHead;
    }
}
