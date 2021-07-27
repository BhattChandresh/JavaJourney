/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:
    the first row consists of the characters "qwertyuiop",
    the second row consists of the characters "asdfghjkl", and
    the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
 */
package com.practice.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyBoardRow {
    public static final String FIRST_ROW = "qwertyuiop";
    public static final String SECOND_ROW = "asdfghjkl";
    public static final String THIRD_ROW = "zxcvbnm";

    public static void main(String[] args) {
        String[] inputWords = {"Hello", "Alaska", "Dad", "Peace"};
        KeyBoardRow keyBoardRow = new KeyBoardRow();
        List<String> result = keyBoardRow.matchInOneRow(inputWords);
        System.out.println(Arrays.toString(result.toArray()));
    }

    protected List<String> matchInOneRow(String[] inputWords) {
        boolean isFirstLine = false;
        boolean isSecondLine = false;
        boolean isThirdLine = false;
        List<String> result = new ArrayList<>();

        for (String word : inputWords) {
            StringBuilder myWord = new StringBuilder();
            for (int index = 0; index < word.length(); index++) {
                String myChar = String.valueOf(word.charAt(index));
                if (FIRST_ROW.contains(myChar.toUpperCase()) || (FIRST_ROW.contains(myChar.toLowerCase()))) {
                    if (isSecondLine || isThirdLine) {
                        myWord = new StringBuilder();
                        break;
                    }
                    isFirstLine = true;
                    myWord.append(myChar);
                } else if (SECOND_ROW.contains(myChar.toUpperCase()) || (SECOND_ROW.contains(myChar.toLowerCase()))) {
                    if (isFirstLine || isThirdLine) {
                        myWord = new StringBuilder();
                        break;
                    }
                    isSecondLine = true;
                    myWord.append(myChar);
                } else if (THIRD_ROW.contains(myChar.toUpperCase()) || (THIRD_ROW.contains(myChar.toLowerCase()))) {
                    if (isFirstLine || isSecondLine) {
                        myWord = new StringBuilder();
                        break;
                    }
                    isThirdLine = true;
                    myWord.append(myChar);
                }
            }
            if (!myWord.toString().isEmpty()) {
                result.add(myWord.toString());
            }
        }
        return result;
    }
}
