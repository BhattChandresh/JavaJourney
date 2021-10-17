package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderTest {
    private Ladder ladder;

    @BeforeEach
    public void init() {
        ladder = new Ladder();
        ladder.setDefaultLadderStartAndEndPosition();
    }

    @Test
    void testGetLadderHead() {
        assertEquals(14, ladder.getLadderHead(4));
        ladder.setLadderDynamically(19, 40);
        assertEquals(38, ladder.getLadderHead(20));
        assertEquals(81, ladder.getLadderHead(62));
        assertEquals(0, ladder.getLadderHead(43));
    }
}