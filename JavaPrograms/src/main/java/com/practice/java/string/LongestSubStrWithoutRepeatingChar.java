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
        //String input = "abcabcbb";
        //String input = "au";
        String input = "aab";
        int length = 0;
        LongestSubStrWithoutRepeatingChar subStrWithoutRepeatingChar = new LongestSubStrWithoutRepeatingChar();
        //length = subStrWithoutRepeatingChar.lengthOfLongestSubstring(input);
        length = subStrWithoutRepeatingChar.lengthOfLongestSubstringWithSet(input);
        System.out.println("Length of the Sub String is : " + length);
    }

    private int lengthOfLongestSubstringWithSet(String s) {
        Set<String> subStr = new HashSet<>();
        int left_ptr = 0;
        int revert_left_ptr = 0;
        StringBuilder str = new StringBuilder();
        int subStrLength = Integer.MIN_VALUE;

        if (s.length() == 0) {
            return 0;
        }

        if(s.length() == 1) {
            return 1;
        }

        while(left_ptr < s.length()) {
            String temp = String.valueOf(s.charAt(left_ptr));
            if(subStr.add(temp)) {
                str.append(temp);
            } else {
                subStrLength = Math.max(str.length(), subStrLength);
                str.setLength(0);
                subStr.clear();
                revert_left_ptr += 1;
                left_ptr =  revert_left_ptr;
                continue;
            }
            left_ptr += 1;
        }
        return Math.max(subStrLength, subStr.size());
    }

    public int lengthOfLongestSubstring(String s) {
        Set<String> subStrList = new HashSet<>();
        String subStr = "";
        int left_ptr = 0;
        int right_ptr = 1;
        int window_size = 0;
        while (left_ptr < s.length()) {
            if (s.charAt(left_ptr) != s.charAt(right_ptr)) {
                right_ptr += 1;
                window_size += 1;
                continue;
            } else {
                subStr = s.substring(left_ptr, right_ptr);
                left_ptr += 1;
                right_ptr = left_ptr + 1;
            }
            subStrList.add(subStr);
            subStr = "";
        }
        return -1;
    }
}


/*
Set<String> subStrList = new HashSet<>();
        String subStr = "";
        int left_ptr = 0;
        int right_ptr = 1;
        while(left_ptr < s.length()) {
            if(s.charAt(left_ptr) != s.charAt(right_ptr)) {
                right_ptr += 1;
                continue;
            } else {
                subStr = s.substring(left_ptr, right_ptr);
                left_ptr += 1;
                right_ptr = left_ptr + 1;
            }
            subStrList.add(subStr);
            subStr = "";
        }
 */
