/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
Example:
Input: s = "Hello"
Output: "hello"
 */
package com.practice.java.string;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LowerCase {
    public static void main(String[] args) {
        LowerCase lowerCase = new LowerCase();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String result = lowerCase.upperCaseToLowerCase(input);
        System.out.println(result);
    }

    protected String upperCaseToLowerCase(String input) {
        if (input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        IntStream.range(0, input.length()).forEach((index) -> {
            if (input.charAt(index) >= 65 && input.charAt(index) <= 90) {
                result.append(Character.toLowerCase(input.charAt(index)));
                return;
            }
            result.append(input.charAt(index));
        });
        return result.toString();
    }
}
