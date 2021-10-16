package com.practice.java.interview.deserve.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NormalDiceServiceTest {

    private NormalDiceService normalDiceService;

    @BeforeEach
    public void init() {
        normalDiceService = new NormalDiceService();
    }

    @Test
    void testGetDiceNumber() {
        assertTrue(normalDiceService.getDiceNumber() <= 6);
        assertFalse(normalDiceService.getDiceNumber() > 6);
    }
}