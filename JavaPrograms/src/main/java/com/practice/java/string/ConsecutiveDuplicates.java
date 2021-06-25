/*
  Given a string S, remove all the consecutive duplicates.
  Here we keep one character and remove all subsequent same characters.
 */
package com.practice.java.string;

import java.util.Scanner;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        ConsecutiveDuplicates consecutiveDuplicates = new ConsecutiveDuplicates();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        String strWithoutConsecutiveDuplicates = consecutiveDuplicates.removeConsecutiveDuplicates(input);
        System.out.println(strWithoutConsecutiveDuplicates);
    }

    String removeConsecutiveDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        char lastChar = ' ';
        char[] chars = input.toCharArray();

        if (input.length() < 1) {
            System.out.println("Given String is Empty");
            return result.toString();
        }

        for (char currentChar : chars) {
            if (lastChar != currentChar) {
                result.append(currentChar);
                lastChar = currentChar;
            }
        }
        return result.toString();
    }
}


