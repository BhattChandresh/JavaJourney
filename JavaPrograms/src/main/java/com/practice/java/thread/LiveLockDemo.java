/*
What Is Livelock
Livelock is another concurrency problem and is similar to deadlock.
In livelock, two or more threads keep on transferring states between one another instead of waiting infinitely
 Consequently, the threads are not able to perform their respective tasks.
A great example of livelock is a messaging system where,
when an exception occurs, the message consumer rolls back the transaction and puts the message back to the head of the queue.
 Then the same message is repeatedly read from the queue,
 only to cause another exception and be put back on the queue. The consumer will never pick up any other message from the queue.

 Both threads need two locks to complete their work.
 Each thread acquires its first lock but finds that the second lock is not available.
 So, in order to let the other thread complete first, each thread releases its first lock and tries to acquire both the locks again.
 */
package com.practice.java.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockDemo {
    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        LiveLockDemo liveLockDemo = new LiveLockDemo();
        new Thread(liveLockDemo::operation1).start();
        new Thread(liveLockDemo::operation2).start();
    }

    public void operation1() {
        while(true) {
            lock1.tryLock();
            System.out.println("lock1 acquired, trying to acquire lock2");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(lock2.tryLock()) {
                System.out.println("lock2 acquired");
            } else {
                System.out.println("can not acquire lock2, releasing lock1");
                lock1.unlock();
                continue;
            }
            System.out.println("Executing first operation");
            break;
        }
        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() {
        while (true) {
            lock2.tryLock();
            System.out.println("lock2 acquired, trying to acquire lock1");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(lock1.tryLock()) {
                System.out.println("lock1 acquired");
            } else {
                System.out.println("can not acquire lock1, releasing lock2");
                lock2.unlock();
                continue;
            }
            System.out.println("Executing second operation");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }
}
