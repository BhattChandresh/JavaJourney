package com.practice.java.interviewquestions.whatistheoutput;

public class ReturnValueInFinally {
    public static void main(String[] args) {
        int result = simple();
        System.out.println(result);
    }

    private static int simple() {
        try {
            System.out.println("try");
            return 5;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("finally");
            return 7;
        }
    }
}
