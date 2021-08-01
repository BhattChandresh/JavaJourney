/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example :
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
 */
package com.practice.java.string;

import java.util.Scanner;

public class MergeStringAlternately {
    public static void main(String[] args) {
        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        sc.close();
        String mergedString = mergeStringAlternately.mergeStrings(string1, string2);
        System.out.println("Merged String = " + mergedString);
    }

    protected String mergeStrings(String string1, String string2) {
        int str1Length = string1.length();
        int str2Length = string2.length();
        int maxLength = Math.max(str1Length, str2Length);
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < maxLength; index++) {
            if (index < str1Length) {
                result.append(string1.charAt(index));
            }
            if (index < str2Length) {
                result.append(string2.charAt(index));
            }
        }
        return result.toString();
    }
}
