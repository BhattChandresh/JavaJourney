package com.practice.java.interviewquestions.whatistheoutput;

public class NonStaticVariableInStaticContext {
    int a;
    static int b;

    static {
        //a= 5;
        b = 7;
    }

    public NonStaticVariableInStaticContext() {
        a = 10;
        b = 20;
    }

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(b);
    }
}
