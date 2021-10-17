package com.practice.java.interview.deserve.dice;

import java.util.Random;

public class DiceService {

    public int getDiceNumber() {
        return new Random().nextInt(6) + 1;
    }

    public int getCrookedDiceNumber() {
        return (new Random().nextInt(6) + 1) * 2;
    }
}
