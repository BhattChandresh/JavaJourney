/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * <p>
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * Input: s = "abcde", goal = "abced"
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, goal.length <= 100
 * s and goal consist of lowercase English letters.
 */

package main.java.com.practice.java.string;

public class RotateString {
    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        //String s = "abcde";
        //String goal = "abced";

        RotateString rotateString = new RotateString();
        boolean result = rotateString.rotateString(s, goal);
        System.out.println("Result is : " + result);
    }

    public boolean rotateString(String s, String goal) {
        StringBuilder str = new StringBuilder(s);
        boolean b = false;
        for (int k = 0; k < s.length(); k++) {
            String temp = s.substring(k, k + 1);
            str.deleteCharAt(0);
            str.append(temp);
            if (goal.contentEquals(str)) {
                b = true;
                break;
            }
        }
        return b;
    }
}
