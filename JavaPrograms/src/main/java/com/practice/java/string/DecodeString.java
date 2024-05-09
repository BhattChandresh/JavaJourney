package main.java.com.practice.java.string;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {

        //String input = "3[a2[c]]";
        //String input = "2[a3[c2[x]]y]";
        //String input = "3[a]2[bc]";
        //String input = "2[abc]3[cd]ef";
        //String input = "100[leetcode]";
        String input = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";


        DecodeString decodeString = new DecodeString();
        String decodedString = decodeString.decodeString(input);
        System.out.println("Decoded String is : " + decodedString);
    }

    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String str = "";
        int number = 1;
        int index = 0;
        String digits = "";

        while (index < s.length()) {

            str = String.valueOf(s.charAt(index));

            while (str.matches("\\d+")) {
                digits = digits + str;
                index++;
                str = String.valueOf(s.charAt(index));
            }

            if (!digits.isEmpty()) {
                intStack.push(Integer.valueOf(digits));
                digits = "";
            }

            if (str.equals("]")) {     //check the most inner bracket
                StringBuilder temp = new StringBuilder();
                StringBuilder s1 = new StringBuilder();
                while (!strStack.peek().equals("[")) { //when the most inner bracket has opening bracket
                    temp.insert(0, strStack.pop());
                }
                strStack.pop(); // remove the most inner opening bracket

                if (!intStack.empty()) {
                    number = intStack.pop();
                }

                for (int n = 0; n <= number - 1; n++) {
                    s1.append(temp);
                }

                if (!strStack.isEmpty() && !strStack.peek().equals("[")) {
                    s1.insert(0, strStack.pop());
                }

                if (!s1.isEmpty()) {
                    str = s1.toString();
                }
            }
            strStack.push(str);
            index++;
        }

        if (!strStack.isEmpty()) {
            StringBuilder myStr = new StringBuilder();
            while (!strStack.isEmpty()) {
                myStr.insert(0, strStack.pop());
            }
            str = myStr.toString();
        }
        return str;
    }
}
