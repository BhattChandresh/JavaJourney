package com.practice.java.Thread;

public class JoinMethodWithThreeThreads {
    static Thread t1;
    static Thread t2;
    static Thread t3;

    public static void main(String[] args) throws InterruptedException {

        Thread3 r3 = new Thread3();
        Thread2 r2 = new Thread2();
        Thread1 r1 = new Thread1();

        t1 = new Thread(r1, "T1");
        t2 = new Thread(r2, "T2");
        t3 = new Thread(r3, "T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();

        for (int i = 41; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        try {
            JoinMethodWithThreeThreads.t2.join();
        } catch (InterruptedException ie) {

        }
        for (int i = 21; i < 41; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        try {
            JoinMethodWithThreeThreads.t3.join();
        } catch (InterruptedException ie) {

        }
        for (int i = 11; i < 21; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }
    }
}