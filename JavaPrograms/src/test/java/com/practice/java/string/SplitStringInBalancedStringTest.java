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

        assertEquals(4, balancedString.makeBalanceString("RLRRLLRLRL").size());
        balancedStr.add("RL");
        balancedStr.add("RL");
        balancedStr.add("RRLL");
        balancedStr.add("RL");
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRRLLRLRL"));
        balancedStr.clear();

        assertEquals(3, balancedString.makeBalanceString("RLLLLRRRLR").size());

        assertEquals(1, balancedString.makeBalanceString("LLLLRRRR").size());
        balancedStr.add("LLLLRRRR");
        assertEquals(balancedStr, balancedString.makeBalanceString("LLLLRRRR"));
        balancedStr.clear();

        assertEquals(2, balancedString.makeBalanceString("RLRRRLLRLL").size());

        assertNull(balancedString.makeBalanceString(""));

        assertEquals(2, balancedString.makeBalanceString("RLRRRLL").size());
        balancedStr.add("RRLL");
        balancedStr.add("LR");
        assertEquals(balancedStr, balancedString.makeBalanceString("RLRRRLL"));
        balancedStr.clear();

        assertEquals(1, balancedString.makeBalanceString("LLLLRRR").size());
    }
}