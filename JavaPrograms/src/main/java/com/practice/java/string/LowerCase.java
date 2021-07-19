/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
Example:
Input: s = "Hello"
Output: "hello"
 */
package com.practice.java.string;

import java.util.Scanner;

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
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) >= 65 && input.charAt(index) <= 90) {
                char toLowerCase = Character.toLowerCase(input.charAt(index));
                result.append(toLowerCase);
            } else {
                result.append(input.charAt(index));
            }
        }
        return result.toString();
    }
}
