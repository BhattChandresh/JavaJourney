package com.practice.java.interview.deserve.gameboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagicLadderTest {
    private MagicLadder magicLadder;

    @BeforeEach
    public void init() {
        magicLadder = new MagicLadder();
        magicLadder.positionMagicLadder(10, 100);
    }

    @Test
    void testGetNewPosition_When_MagicLadder_Used_FirstTime() {
        assertEquals(100, magicLadder.getNewPosition(10));
    }

    @Test
    void testGetNewPosition_When_MagicLadder_become_dormant() {
        assertEquals(100, magicLadder.getNewPosition(10));
        assertEquals(10, magicLadder.getNewPosition(10));
    }
}