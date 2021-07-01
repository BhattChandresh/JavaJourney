/*
Given an input string s, reverse the order of the words. The Words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Example :
(1) "        hello world"   ->  "world hello"
(2) "a good      example   "  ->  "example good a"


 */
package com.practice.java.string;

import java.util.Scanner;

public class ReverseWordInString {
    public static void main(String[] args) {
        ReverseWordInString reverse = new ReverseWordInString();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        if(input.isEmpty()) {
            System.exit(0);
        }
        reverse.reverseWordInString(input);
    }

    String reverseWordInString(String input) {
        input = input.replaceAll("\\s+", " ").trim();
        String[] words = input.split(" ");
        input = "";
        for(int index = words.length-1;index >=0;index--) {
            input = input.concat(words[index]).concat(" ");
        }
        input = input.trim();
        return input;
    }
}
