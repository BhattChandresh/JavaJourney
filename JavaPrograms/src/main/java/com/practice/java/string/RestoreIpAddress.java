/*
Given a string s containing only digits, return all possible valid IP addresses that can be obtained from s. You can return them in any order.

A valid IP address consists of exactly four integers, each integer is between 0 and 255,
separated by single dots and cannot have leading zeros.
For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
 */
package com.practice.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class RestoreIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        RestoreIpAddress restoreIpAddress = new RestoreIpAddress();
        List<String> validIpAddress = restoreIpAddress.getAllPossibleValidIpAddress(input);
        System.out.println(validIpAddress);
    }

    protected List<String> getAllPossibleValidIpAddress(final String input) {
        Predicate<String> isValidInputStr = inputStr -> inputStr == null || inputStr.length() < 4 || inputStr.length() > 12;
        if (isValidInputStr.test(input)) {
            return null;
        }

        Predicate<String> isInvalidByte = (inputStr) -> ((inputStr.length() > 3) || (inputStr.startsWith("0") && inputStr.length() > 1));
        Predicate<String> isValidByteRange = (inputStr) -> {
            int ipByte = Integer.parseInt(inputStr);
            return ipByte >= 0 && ipByte <= 255;
        };

        List<String> validateIpAddressList = new ArrayList<>();
        int length = input.length();
        for (int index1 = 1; index1 < length && index1 < 4; index1++) {
            String firstByte = getSubString(0, index1, input);
            if (isInvalidByte.test(firstByte) || !(isValidByteRange.test(firstByte))) {
                continue;
            }
            for (int index2 = 1; index1 + index2 < length && index2 < 4; index2++) {
                String secondByte = getSubString(index1, index1 + index2, input);
                if (isInvalidByte.test(secondByte) || !(isValidByteRange.test(secondByte))) {
                    continue;
                }
                for (int index3 = 1; index1 + index2 + index3 < length && index3 < 4; index3++) {
                    String thirdByte = getSubString(index1 + index2, index1 + index2 + index3, input);
                    String fourthByte = input.substring(index1 + index2 + index3);
                    if ((isInvalidByte.test(fourthByte) || !(isValidByteRange.test(fourthByte)))
                            || (isInvalidByte.test(thirdByte) || !(isValidByteRange.test(thirdByte)))) {
                        continue;
                    }
                    validateIpAddressList.add(String.join(".", firstByte, secondByte, thirdByte, fourthByte));
                }
            }
        }
        return validateIpAddressList;
    }

    private String getSubString(int startIndex, int endIndex, String input) {
        return input.substring(startIndex, endIndex);
    }
}
