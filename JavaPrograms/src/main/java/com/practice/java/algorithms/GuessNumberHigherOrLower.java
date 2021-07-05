package com.practice.java.algorithms;

import java.util.Scanner;

public class GuessNumberHigherOrLower {
    int[] range;

    public static void main(String[] args) {
        GuessNumberHigherOrLower higherOrLower = new GuessNumberHigherOrLower();
        Scanner sc = new Scanner(System.in);
        int lastNumber = sc.nextInt();
        int pickedNumber = sc.nextInt();
        int guessedNumber = sc.nextInt();
        higherOrLower.prepareNumberRangeForGuessing(lastNumber);
        int result = higherOrLower.guessNumber(guessedNumber, pickedNumber);
        if (result == pickedNumber) {
            System.out.println("Picked number = " + pickedNumber);
        } else if (result == -1) {
            System.out.println("Guess number is  lower than picked number");
        } else {
            System.out.println("Guess number is higher than picked number");
        }
        sc.close();
    }

    private int guessNumber(int guessedNumber, int pickedNumber) {
        int head = 0;
        int tail = range.length - 1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (range[mid] == pickedNumber) {
                return pickedNumber;
            }
            if (range[mid] < pickedNumber) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    private void prepareNumberRangeForGuessing(int lastNumber) {
        range = new int[lastNumber];
        for (int index = 1; index <= lastNumber-1; index++) {
            range[index] = index;
        }
    }


}
