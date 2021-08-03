package com.practice.java.interviewquestions.whatistheoutput;

public class PassPrimitiveTypeToMethod {
    int x;

    public int m1(int x) {
        this.x = this.x + x * x;
        return x;
    }

    public static void main(String[] args) {
        int x = 10;
        PassPrimitiveTypeToMethod passPrimitiveTypeToMethod = new PassPrimitiveTypeToMethod();
        System.out.println(passPrimitiveTypeToMethod.m1(x));
        System.out.println(passPrimitiveTypeToMethod.m1(x));
        System.out.println(passPrimitiveTypeToMethod.m1(passPrimitiveTypeToMethod.x + x));
    }
}
