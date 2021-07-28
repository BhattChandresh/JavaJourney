/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it in the maximum amount of balanced strings.
Return the maximum amount of split balanced strings.
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
package com.practice.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitStringInBalancedString {
    private boolean isRecursiveCall = false;
    protected List<String> output = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        SplitStringInBalancedString splitStringInBalancedString = new SplitStringInBalancedString();
        List<String> result = splitStringInBalancedString.makeBalanceString(input);
        System.out.println(result);
    }

    protected List<String> makeBalanceString(String input) {
        if (input.isEmpty()) {
            return null;
        }
        return splitStringInBalance(input);
    }

    private List<String> splitStringInBalance(String input) {
        int lCount = 0;
        int rCount = 0;
        StringBuilder balancedStr = new StringBuilder();

        String myChar;

        for (int index = 0; index < input.length(); index++) {
            myChar = String.valueOf(input.charAt(index));
            if (myChar.equals("R")) {
                rCount += 1;
            } else {
                lCount += 1;
            }
            balancedStr.append(myChar);

            if (lCount == rCount) {
                rCount = 0;
                lCount = 0;
                if (isRecursiveCall) {
                    balancedStr.reverse();
                    isRecursiveCall = false;
                }

                if (!balancedStr.toString().isEmpty()) {
                    output.add(balancedStr.toString());
                }
                balancedStr = new StringBuilder();
            }
        }

        if ((balancedStr.toString().length() > 1) && (lCount > 0) && (rCount > 0)) {
            balancedStr.reverse();
            isRecursiveCall = true;
            return splitStringInBalance(balancedStr.toString());
        }
        return output;
    }
}
