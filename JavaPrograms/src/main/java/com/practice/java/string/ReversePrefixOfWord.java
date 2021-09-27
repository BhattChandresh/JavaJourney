/*
2000
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and
ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
 The resulting string will be "dcbaefd".
Return the resulting string.
 */

package com.practice.java.string;

import java.util.Scanner;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String offset = sc.nextLine();
        sc.close();
        char ch = offset.charAt(0);
        ReversePrefixOfWord reversePrefixOfWord = new ReversePrefixOfWord();
        String result = reversePrefixOfWord.reversePrefix(input, ch);
        System.out.println("ReversePrefixOfWord = " + result);
    }

    protected String reversePrefix(String word, char ch) {
        if (word.isEmpty()) {
            return null;
        }

        if (!(word.contains(String.valueOf(ch)))) {
            return word;
        }
        int index = word.indexOf(ch);
        String str1 = word.substring(0, index + 1);
        str1 = new StringBuilder(str1).reverse().toString();
        return str1.concat(word.substring(index+1));
    }
}
