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
import java.util.Stack;

public class SplitStringInBalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        SplitStringInBalancedString splitStringInBalancedString = new SplitStringInBalancedString();
        splitStringInBalancedString.makeBalanceString(input);
    }

    protected List<String> makeBalanceString(String input) {
        if (input.isEmpty()) {
            return null;
        }
        Stack<String> stack = new Stack<>();
        pushOperation(stack, input);
        return popOperation(stack);
    }

    private List<String> popOperation(Stack<String> stack) {
        String myChar;
        int rCount = 0;
        int lCount = 0;
        StringBuilder balancedStr = new StringBuilder();
        List<String> output = new ArrayList<>();

        while (!(stack.isEmpty())) {
            myChar = stack.pop();
            if (myChar.equals("R")) {
                rCount += 1;
            } else {
                lCount += 1;
            }
            balancedStr.append(myChar);

            if (lCount == rCount) {
                rCount = 0;
                lCount = 0;
                balancedStr.reverse();
                output.add(balancedStr.toString());
                balancedStr = new StringBuilder();
            }
        }
        return output;
    }

    private void pushOperation(Stack<String> stack, String input) {
        for (int index = 0; index < input.length(); index++) {
            stack.push(String.valueOf(input.charAt(index)));
        }
    }
}
