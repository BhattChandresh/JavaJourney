package com.practice.java.java8.lambda;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class Square {
    public static void main(String[] args) {
        GetSquare s = x -> x*x;
        System.out.println(s.squareIt(5));
        System.out.println(s.squareIt(10));
    }
}

@FunctionalInterface
interface  GetSquare {
    public int squareIt(int x);
}