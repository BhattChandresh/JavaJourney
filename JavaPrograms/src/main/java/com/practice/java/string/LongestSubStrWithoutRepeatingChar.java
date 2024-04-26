/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
package main.java.com.practice.java.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepeatingChar {
    public static void main(String[] args) {
        String input = "abcabcbb";
        //String input = "au";
        //String input = "aab";
        int length = 0;
        LongestSubStrWithoutRepeatingChar subStrWithoutRepeatingChar = new LongestSubStrWithoutRepeatingChar();
        length = subStrWithoutRepeatingChar.lengthOfLongestSubstringWithSet(input);
        System.out.println("Length of the Sub String is : " + length);
    }

    private int lengthOfLongestSubstringWithSet(String s) {
        Set<Character> subStr = new HashSet<>();
        int left_ptr = 0;
        int revert_left_ptr = 0;
        int subStrLength = 0;

        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        while (left_ptr < s.length()) {
            if (subStr.add(s.charAt(left_ptr))) {
            } else {
                subStrLength = Math.max(subStr.size(), subStrLength);
                subStr.clear();
                revert_left_ptr += 1;
                left_ptr = revert_left_ptr;
                continue;
            }
            left_ptr += 1;
        }
        return Math.max(subStrLength, subStr.size());
    }
}





