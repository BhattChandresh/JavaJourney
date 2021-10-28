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
    void testGetLadderHead_ValidHead() {
        assertEquals(14, ladder.getNewPosition(4));
        ladder.setLadderDynamically(19, 40);
        assertEquals(38, ladder.getNewPosition(20));
        assertEquals(81, ladder.getNewPosition(62));
    }

    @Test
    void testGetLadderHead_Where_NoLadder_Present() {
        assertEquals(43, ladder.getNewPosition(43));
        assertEquals(56, ladder.getNewPosition(56));
    }
}