package com.practice.java.Thread.producerconsumer;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        BlockingQ queue = new BlockingQ(10);
        Random random = new Random();

        Runnable produceThread = () -> {
            while (true) {
                queue.produce(random.nextInt(1000));
            }
        };

        Runnable consumerThread = () -> {
            while (true) {
                int element = queue.consume();
                System.out.println("Element  " + element + " Consumed by consumer");
            }
        };

        new Thread(produceThread).start();
        new Thread(consumerThread).start();
    }
}
