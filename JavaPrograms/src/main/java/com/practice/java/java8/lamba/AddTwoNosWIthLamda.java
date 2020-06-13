package com.practice.java.java8.lamba;

public class AddTwoNosWIthLamda {
    public static void main(String[] args) {
        Sum s = (a,b) -> System.out.println("Sum = " + (a+b));
        s.sum(5,15);
        s.sum(75,56);
    }
}

@FunctionalInterface
interface Sum {
    public void sum(int a, int b);
}
