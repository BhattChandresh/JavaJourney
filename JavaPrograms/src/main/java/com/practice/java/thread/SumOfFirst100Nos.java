package com.practice.java.thread;

public class SumOfFirst100Nos {
    public static void main(String[] args) {
        GetTotal gt = new GetTotal();
        Thread t = new Thread(gt);
        t.start();
        synchronized (gt) {
            try {
                System.out.println("Main thread trying to call wait method");
                gt.wait(5000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Main thread got the notification");
            System.out.println("Total is = " + gt.total);
        }
    }
}

class GetTotal implements Runnable {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child Thread starting calculation");
            for (int i = 1; i <= 100; i++) {
                total = total + i;
            }
            this.notify();
            System.out.println("Child thread gave notification");
        }
    }
}



