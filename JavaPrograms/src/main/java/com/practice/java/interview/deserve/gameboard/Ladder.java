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
        ladderMap.put(Constant.LADDER_1_START, Constant.LADDER_1_END);
        ladderMap.put(Constant.LADDER_2_START, Constant.LADDER_2_END);
        ladderMap.put(Constant.LADDER_3_START, Constant.LADDER_3_END);
        ladderMap.put(Constant.LADDER_4_START, Constant.LADDER_4_END);
        ladderMap.put(Constant.LADDER_5_START, Constant.LADDER_5_END);
        ladderMap.put(Constant.LADDER_6_START, Constant.LADDER_6_END);
        ladderMap.put(Constant.LADDER_7_START, Constant.LADDER_7_END);
        ladderMap.put(Constant.LADDER_8_START, Constant.LADDER_8_END);
        ladderMap.put(Constant.LADDER_9_START, Constant.LADDER_9_END);
    }

    public int getLadderHead(int ladderHead) {
        if (ladderMap.get(ladderHead) != null) {
            return ladderMap.get(ladderHead);
        }
        return 0;
    }
}
