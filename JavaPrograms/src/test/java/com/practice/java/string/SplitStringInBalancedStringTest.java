package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SplitStringInBalancedStringTest {
    private SplitStringInBalancedString balancedString;

    @BeforeEach
    public void init() {
        balancedString = new SplitStringInBalancedString();
    }

    @Test
    void testMakeBalanceString() {
        List<String> balancedStr = new ArrayList<>();

        balancedStr.add("RL");
        balancedStr.add("RRLL");
        balancedStr.add("RL");
        balancedStr.add("RL");
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRRLLRLRL"));
        assertEquals(4, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("RL");
        balancedStr.add("LLLRRR");
        balancedStr.add("LR");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("RLLLLRRRLR"));
        assertEquals(3, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("LLLLRRRR");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("LLLLRRRR"));
        assertEquals(1, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("RL");
        balancedStr.add("RRRLLRLL");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRRRLLRLL"));
        assertEquals(2, balancedStr.size());
        balancedStr.clear();

        assertNull(balancedString.makeBalanceString(""));
        balancedStr.clear();

        balancedStr.add("RL");
        balancedStr.add("RRLL");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRRRLL"));
        assertEquals(2, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("LLLRRR");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("LLLRRRR"));
        assertEquals(1, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("RL");
        balancedStr.add("RL");
        balancedStr.add("RRLL");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRLRRRRLL"));
        assertEquals(3, balancedStr.size());
        balancedStr.clear();

        balancedStr.add("RL");
        balancedStr.add("RL");
        balancedStr.add("RL");
        balancedStr.add("RL");
        balancedStr.add("LR");
        balancedString.output.clear();
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRLRRRRRRRRLLRRL"));
        assertEquals(5, balancedStr.size());
    }
}