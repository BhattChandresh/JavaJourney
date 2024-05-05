/**
 * You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.
 * Return the number of special letters in word.

 * Example 1:
 * Input: word = "aaAbcBC"
 * Output: 3
 * Explanation:
 * The special characters in word are 'a', 'b', and 'c'.

 * Example 2:
 * Input: word = "abc"
 * Output: 0
 * Explanation:
 * No character in word appears in uppercase.

 * Example 3:
 * Input: word = "abBCab"
 * Output: 1
 * Explanation:
 * The only special character in word is 'b'.

 * Constraints:

 * 1 <= word.length <= 50
 * word consists of only lowercase and uppercase English letters.
 */

package main.java.com.practice.java.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountTheSpecialChar1 {
    public static void main(String[] args) {
        //String input = "aaAbcBC";
        //String input = "a";
        //String input = "abc";
        String input = "abBCab";
        CountTheSpecialChar1 count = new CountTheSpecialChar1();
        int result = count.numberOfSpecialChars(input);
        System.out.println("No. of Special Charachter are : " + result);
    }

    public int numberOfSpecialChars(String word) {
        int countOfSpecialChars = 0;
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int k = 0; k < word.length(); k++) {
            String temp = String.valueOf(word.charAt(k));
            boolean isOk = set.add(temp);
            if (isOk) {
                if (list.contains(temp.toUpperCase()) || (list.contains(temp.toLowerCase()))) {
                    countOfSpecialChars++;
                }
                list.add(temp);
            }
        }
        return countOfSpecialChars;
    }
}
