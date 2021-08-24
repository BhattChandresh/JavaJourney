package com.practice.java.interviewcoding;

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String canonicalPath = simplifyPath.getCanonicalPath(input);
        System.out.println("Canonical Path = " + canonicalPath);
    }

    public String getCanonicalPath(String input) {
        StringBuilder canonicalPath = new StringBuilder();

        Stack<String> stack = new Stack<>();
        if (input.isEmpty()) {
            return "";
        }
        String[] dir_files = input.split("/");

        for (String dir_file : dir_files) {
            if (!(dir_file.isEmpty())) {
                if (dir_file.equals("..")) {
                    if (!(stack.isEmpty())) {
                        stack.pop();
                    }
                } else if (!(dir_file.equals("."))) {
                    stack.push("/" + dir_file);
                }
            }
        }

        if (stack.isEmpty()) {
            canonicalPath.append("/");
            return canonicalPath.toString();
        }

        while (!stack.isEmpty()) {
            canonicalPath.insert(0, stack.pop());
        }
        return canonicalPath.toString();
    }
}
