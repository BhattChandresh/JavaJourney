package com.practice.java.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CountDownLatchDemo {
    private static final int NO_OF_LATCH = 3;
    private static final int THREAD_POOL_SIZE = 4;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Execution Started...");
        CountDownLatchDemo latchDemo = new CountDownLatchDemo();
        CountDownLatch latch = new CountDownLatch(NO_OF_LATCH);
        ExecutorService service =  latchDemo.createThreadPool();

        service.execute(new DependentServices(latch));
        service.execute(new DependentServices(latch));
        service.execute(new DependentServices(latch));

        latch.await(30, TimeUnit.SECONDS);
        latchDemo.clearThreadPool(service);
        System.out.println("Main Thread Execution Completed...");
    }

    private ExecutorService createThreadPool() {
        return Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    }

    private void clearThreadPool(ExecutorService service) {
        service.shutdown();
    }
}

class DependentServices implements Runnable {

    private final CountDownLatch latch;

    public DependentServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Task Executed By : " + Thread.currentThread().getName());
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        latch.countDown();
        System.out.println("Get the No. of Latch : " + latch.getCount());
    }
}
