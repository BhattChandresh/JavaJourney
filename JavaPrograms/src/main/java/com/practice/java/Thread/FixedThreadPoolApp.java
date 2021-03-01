package com.practice.java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolApp {
    static final int MAX_SIZE = 2;

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("***** Thread-1 *****");
            for (int i = 1; i < 11; i++) {
                System.out.println(i);
            }
        };

        Runnable r2 = () -> {
            System.out.println("***** Thread-2 *****");
            for (int i = 11; i < 21; i++) {
                System.out.println(i);
            }
        };

        Runnable r3 = () -> {
            System.out.println("***** Thread-3 *****");
            for (int i = 21; i < 31; i++) {
                System.out.println(i);
            }
        };

        Runnable r4 = () -> {
            System.out.println("***** Thread-4 *****");
            for (int i = 31; i < 41; i++) {
                System.out.println(i);
            }
        };

        Runnable r5 = () -> {
            System.out.println("***** Thread-5 *****");
            for (int i = 41; i < 51; i++) {
                System.out.println(i);
            }
        };

        Runnable r6 = () -> {
            System.out.println("***** Thread-6 *****");
            for (int i = 51; i < 61; i++) {
                System.out.println(i);
            }
        };

        Runnable r7 = () -> {
            System.out.println("***** Thread-7 *****");
            for (int i = 61; i < 71; i++) {
                System.out.println(i);
            }
        };

        Runnable r8 = () -> {
            System.out.println("***** Thread-8 *****");
            for (int i = 71; i < 81; i++) {
                System.out.println(i);
            }
        };

        Runnable r9 = () -> {
            System.out.println("***** Thread-9 *****");
            for (int i = 81; i < 91; i++) {
                System.out.println(i);
            }
        };

        Runnable r10 = () -> {
            System.out.println("***** Thread-10 *****");
            for (int i = 91; i < 101; i++) {
                System.out.println(i);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(MAX_SIZE);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);
        pool.execute(r8);
        pool.execute(r9);
        pool.execute(r10);

        pool.shutdown();

    }
}
