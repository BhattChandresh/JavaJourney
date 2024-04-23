/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
package main.java.com.practice.java.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //String[] s = {"power", "po", "post", "postman","poster"};
        //String[] s = {""};
        //String[] s = {"", ""};
        //String[] s = {"flower","flow","flight"};
        String[] s = {"dog", "racecar", "car"};
        //String[] s = {"a"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(s);
        if (!result.isEmpty()) {
            System.out.println("Longest Common Prefix is : " + result);
        } else {
            System.out.println("Longest Common Prefix is empty");
        }
    }

    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        int pointer = 0;
        String result = "";
        char current = 0;
        char previous = 0;
        int arrLength = strs.length;

        if (arrLength == 1) {
            return strs[0];
        }

        while (true) {
            if (count == arrLength) {
                count = 0;
                pointer += 1;
            }

            if (count == 0) {
                if (pointer == strs[count].length()) {
                    return result;
                }
                if (pointer < strs[count].length()) {
                    current = strs[count].charAt(pointer);
                }
            } else {
                if (pointer == strs[count].length()) {
                    return result;
                }
                if (pointer < strs[count].length()) {
                    previous = current;
                    current = strs[count].charAt(pointer);
                    if (previous != current) {
                        break;
                    } else {
                        if (count == arrLength - 1) {
                            result = result + current;
                        }
                    }
                }
            }
            count += 1;
        }
        return result;
    }
}
