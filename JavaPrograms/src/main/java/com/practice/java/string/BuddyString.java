/**
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
 * <p>
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ab", goal = "ba"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 * Example 2:
 * <p>
 * Input: s = "ab", goal = "ab"
 * Output: false
 * Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
 * Example 3:
 * <p>
 * Input: s = "aa", goal = "aa"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 * Constraints:
 * <p>
 * 1 <= s.length, goal.length <= 2 * 104
 * s and goal consist of lowercase letters.
 */

package main.java.com.practice.java.string;

public class BuddyString {
    public static void main(String[] args) {

        //String s = "abcd";
        //String goal = "cbad";

        //String s = "aa";
        //String goal = "aa";

        //String s = "aaaaaaabc";
        //String goal = "aaaaaaacb";

        //String s = "abcd";
        //String goal = "badc";

        String s = "abcaa";
        String goal = "abcbb";


        BuddyString buddyString = new BuddyString();
        boolean isBuddyString = buddyString.buddyStrings(s, goal);

        if (isBuddyString) {
            System.out.println("Given String s " + s + " is a buddy String");
        } else {
            System.out.println("Given String s " + s + " is not a buddy String");
        }
    }

    public boolean buddyStrings(String s, String goal) {

        StringBuilder str = new StringBuilder(s);
        boolean isBuddyString = false;
        int count = 0;

        if (s.length() == 1) {
            return false;
        }

        if (s.length() == 2) {
            str.setCharAt(0, s.charAt(1));
            str.setCharAt(1, s.charAt(0));
            return goal.contentEquals(str);
        }

        for (int t = 0; t < goal.length(); t++) {
            String temp = String.valueOf(goal.charAt(t));
            if (!String.valueOf(s.charAt(t)).equals(temp)) {
                str.setCharAt(t, goal.charAt(t));
                count++;
            }
        }

        if (goal.contentEquals(str) && count <= 2) {
            isBuddyString = true;
        }
        return isBuddyString;
    }
}

//NOTE: 36 test cases gets passed, 3 test cases gets failed.

