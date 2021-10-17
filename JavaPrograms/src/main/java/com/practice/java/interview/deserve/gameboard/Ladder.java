package com.practice.java.interview.deserve.gameboard;

import java.util.HashMap;
import java.util.Map;

public class Ladder {
    private final Map<Integer, Integer> ladderMap;


    public Ladder() {
        ladderMap = new HashMap<>();
    }

    public void setLadderDynamically(int start, int end) {
        ladderMap.put(start, end);
    }

    public void setDefaultLadderStartAndEndPosition() {
        ladderMap.put(4, 14);
        ladderMap.put(9, 30);
        ladderMap.put(20, 38);
        ladderMap.put(28, 84);
        ladderMap.put(36, 44);
        ladderMap.put(42, 63);
        ladderMap.put(51, 67);
        ladderMap.put(62, 81);
        ladderMap.put(71, 90);
    }

    public int getLadderHead(int ladderHead) {
        if (ladderMap.get(ladderHead) != null) {
            return ladderMap.get(ladderHead);
        }
        return 0;
    }
}
