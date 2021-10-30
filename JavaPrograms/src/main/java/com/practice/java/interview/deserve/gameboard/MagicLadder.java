package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class MagicLadder implements MovePiece {
    protected Map<Integer, Integer> magicLadderMap;
    private boolean hasUsedOnce;

    public MagicLadder() {
        magicLadderMap = new HashMap<>();
        hasUsedOnce = false;
    }

    public void positionMagicLadder(int ladderHead, int ladderTail) {
        magicLadderMap.put(ladderHead, ladderTail);
    }

    @Override
    public int getNewPosition(int ladderTail) {
        if (!hasUsedOnce) {
            if (magicLadderMap.get(ladderTail) != null) {
                hasUsedOnce = true;
                return magicLadderMap.get(ladderTail);
            }
        }
        return ladderTail;
    }
}
