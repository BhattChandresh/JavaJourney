package com.practice.java.interview.deserve.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceServiceTest {

    private DiceService diceService;

    @BeforeEach
    public void init() {
        diceService = new DiceService();
    }

    @Test
    void testGetDiceNumber_ValidNumber() {
        assertTrue(diceService.getDiceNumber() <= 6);
    }

    @Test
    void testGetDiceNumber_InValidNumber() {
        assertFalse(diceService.getDiceNumber() > 6);
    }

    @Test
    void testGetCrookedDiceNumber_ValidNumber() {
        int number = diceService.getCrookedDiceNumber();
        assertTrue(number == 2 || number == 4 || number == 6 || number == 8 || number == 10 || number == 12);
    }

    @Test
    void testGetCrookedDiceNumber_InvalidNumber() {
        int number = diceService.getCrookedDiceNumber();
        assertFalse(number > 12);
    }
}
