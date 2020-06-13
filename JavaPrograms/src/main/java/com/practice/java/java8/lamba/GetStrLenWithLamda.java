package com.practice.java.java8.lamba;

public class GetStrLenWithLamda {
    public static void main(String[] args) {
        getLen len = s -> s.length();
        System.out.println(len.getStrLen("Hello"));
        System.out.println(len.getStrLen("Chandresh Bhatt"));
    }
}

@FunctionalInterface
interface getLen {
    public int getStrLen(String s);
}