/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example:
Input: s = "God Ding"
Output: "doG gniD"

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

 */
package com.practice.java.string;

public class ReverseWordInString3 {
    public static void main(String[] args) {
        ReverseWordInString3 reverseWordInString3 = new ReverseWordInString3();
        //String input = "God Ding";
        String input = "Let's take LeetCode contest";
        String result = reverseWordInString3.reverseCharactersInEachWordBruteForce(input);
        System.out.println(result);
    }

    protected String reverseCharactersInEachWordBruteForce(String input) {
        String result = "";

        if (input.isEmpty()) {
            return "";
        }

        String[] strArray = input.split(" ");
        for (String word : strArray) {
            result = result.concat(reverseChars(word).concat(" "));
        }
        return result.trim();
    }

    private String reverseChars(String word) {
        StringBuilder result = new StringBuilder();
        for (int index = word.length() - 1; index > -1; index--) {
            result.append(word.charAt(index));
        }
        return result.toString();
    }
}
