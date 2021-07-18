/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Input: haystack = "hello", needle = "ll"
Output: 2
 */
package com.practice.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class StrStr {
    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        Scanner sc = new Scanner(System.in);
        String hayStack = sc.nextLine();
        String needle = sc.next();
        sc.close();
        int index = strStr.customIndexOf(hayStack, needle);
        System.out.println(index);
    }

    protected int customIndexOf(String hayStack, String needle) {
        StringBuilder needle2 = new StringBuilder();
        int count = 0;
        int[] indexes = new int[needle.length()];

        if (needle.isEmpty()) {
            return 0;
        }

        for (int index = 0; index < hayStack.length(); index++) {
            if (hayStack.charAt(index) == needle.charAt(count)) {
                needle2.append(hayStack.charAt(index));
                indexes[count] = index;
                if (needle2.toString().equals(needle)) {
                    return indexes[0];
                }
                count += 1;
            } else if (count > 0) {
                count = 0;
                needle2 = new StringBuilder();
                Arrays.fill(indexes, 0);
            }
        }
        return -1;
    }
}
