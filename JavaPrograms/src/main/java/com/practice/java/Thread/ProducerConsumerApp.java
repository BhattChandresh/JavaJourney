package com.practice.java.Thread;

import java.util.ArrayList;
import java.util.Random;

public class ProducerConsumerApp {
    public static void main(String[] args) {
        final int SIZE = 10;
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        Thread producer = new Thread(new Producer(buffer, SIZE), "Producer");
        Thread consumer = new Thread(new Consumer(buffer, SIZE), "Consumer");
        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    int size;
    ArrayList buffer;
    Random r = new Random();

    Producer(ArrayList buffer, int size) {
        this.buffer = buffer;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produce(r.nextInt(100));
            } catch (InterruptedException e) {

            }
        }
    }

    void produce(int element) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() >= size) {
                buffer.wait();
            }
        }

        synchronized (buffer) {
            buffer.add(element);
            buffer.notify();
            System.out.println(buffer);
        }

    }
}

class Consumer implements Runnable {
    int size;
    ArrayList buffer;

    Consumer(ArrayList buffer, int size) {
        this.buffer = buffer;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException ie) {

            }
        }
    }

    void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            synchronized (buffer) {
                buffer.wait();
            }
        }
        synchronized (buffer) {
            buffer.notify();
            buffer.remove(0);
        }
    }
}


//public class ProducerConsumerApp {
//    volatile static ArrayList<Integer> buffer = new ArrayList<Integer>();
//    public static void main(String[] args) {
//        final int SIZE = 10;
//           Runnable p = () -> {
//            Random random = new Random();
//            System.out.println("P -> Producer Thread Started");
//            while(true) {
//                while(buffer.size() >= SIZE) {
//                    synchronized (buffer) {
//                        System.out.println("P -> Buffer is FULL, producer thread going into waiting state");
//                        try {
//                            buffer.wait();
//                        } catch (InterruptedException ie) {
//                            ie.printStackTrace();
//                        }
//                    }
//                }
//                int element = random.nextInt(100);
//                System.out.println(" P -> " + element);
//                synchronized (buffer) {
//                    buffer.notify();
//                    buffer.add(element);
//                    System.out.println("P -> Buffer size = " + buffer.size());
//
//                }
//            }
//        };
//
//        Runnable c = () ->  {
//            System.out.println("C -> Consumer Thread Started");
//            while(true) {
//                System.out.println("C -> " + buffer.isEmpty());
//                while(buffer.isEmpty()) {
//                       synchronized(buffer) {
//                        System.out.println("C -> Buffer is EMPTY, consumer thread going into waiting state");
//                        try {
//                            buffer.wait();
//                        } catch (InterruptedException ie) {
//                            ie.printStackTrace();
//                        }
//                    }
//                }
//                synchronized (buffer) {
//                    buffer.notify();
//                    int element = buffer.remove(0);
//                    System.out.println("C -> Consumed element = " + element);
//
//                }
//            }
//        };
//
//        Thread producer = new Thread(p,"Producer");
//        Thread consumer = new Thread(c,"Consumer");
//        producer.start();
//        consumer.start();
//    }
//}
