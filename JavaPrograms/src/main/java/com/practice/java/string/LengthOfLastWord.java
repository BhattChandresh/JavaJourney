/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.
 */
package com.practice.java.string;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lastWordLength = new LengthOfLastWord();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        lastWordLength.getLengthOfLastWord(input);
    }

    protected int getLengthOfLastWord(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        input = input.replaceAll("\\s+", " ").trim();
        String[] strArr = input.split(" ");
        return strArr[strArr.length - 1].length();
    }
}
