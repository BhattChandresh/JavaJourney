package com.practice.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeadLockWithSynchronized {
    final List<Integer> myList1;
    final List<Integer> myList2;

    public DeadLockWithSynchronized() {
        this.myList1 = new ArrayList<>();
        this.myList2 = new ArrayList<>();
    }

    public static void main(String[] args) {
        DeadLockWithSynchronized deadLock = new DeadLockWithSynchronized();
        Runnable thread1 = () -> {
            synchronized (deadLock.myList1) {
                System.out.println("Thread-1 acquires the myList1 lock.");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (deadLock.myList2) {
                    System.out.println("Thread-2 acquires the myList2 lock.");
                }
            }
        };

        Runnable thread2 = () -> {
            synchronized (deadLock.myList2) {
                System.out.println("Thread-2 acquires the myList2 lock.");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ((deadLock.myList1)) {
                    System.out.println("Thread-1 acquires the myList1 lock.");
                }
            }
        };
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
