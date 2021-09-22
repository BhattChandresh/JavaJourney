/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
 */
package com.practice.java.string;

import java.util.Scanner;

public class DefangIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        DefangIpAddress defangIpAddress = new DefangIpAddress();
        String defangIpAddr = defangIpAddress.getDefangIpAddress(input);
        System.out.println(defangIpAddr);
    }

    protected String getDefangIpAddress(String input) {

        if(input.length() == 0 || input.length() > 15) {
            return "";
        }

        String[] bytes = input.split("\\.");
        return String.join("[.]", bytes);
    }
}
