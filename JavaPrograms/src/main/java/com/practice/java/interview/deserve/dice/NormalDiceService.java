package com.practice.java.interview.deserve.dice;

import java.util.Random;

public class NormalDiceService {

    public int getDiceNumber() {
        return new Random().nextInt(6) + 1;
    }
}
