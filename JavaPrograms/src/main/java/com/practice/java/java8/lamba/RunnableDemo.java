package com.practice.java.java8.lamba;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int index=0; index <11;index++) {
                System.out.println("I am Child Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        for(int index1=0;index1 < 11;index1++) {
            System.out.println(" I am main thread");
        }

    }
}
