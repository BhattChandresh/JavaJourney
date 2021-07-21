package com.practice.java.thread.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQ {
    private final int MAX_SIZE;
    private final List<Integer> myQueue;
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;

    public BlockingQ(int capacity) {
        this.MAX_SIZE = capacity;
        myQueue = new ArrayList<>();
        lock = new ReentrantLock(true);
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }

    void produce(Integer element) {
            lock.lock();
            try {
                if (myQueue.size() == MAX_SIZE) {
                    try {
                        notFull.await(5, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                myQueue.add(element);
                System.out.println("Element " + element + " produced by Producer");
                notEmpty.signal();
            } finally {
                lock.unlock();
            }

    }

    int consume() {
        lock.lock();
        try {
            while (myQueue.isEmpty()) {
                try {
                    notEmpty.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int element = myQueue.remove(0);
            notFull.signal();
            return element;
        } finally {
            lock.unlock();
        }
    }
}
