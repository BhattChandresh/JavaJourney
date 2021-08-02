package com.practice.java.datastructure.priorityqueue;

public class App {
    public static void main(String[] args) {
        Pqueue pqueue = new Pqueue(1000);

        pqueue.enqueue(6);
        pqueue.enqueue(8);
        pqueue.enqueue(2);
        pqueue.enqueue(1);
        pqueue.enqueue(12);
        pqueue.enqueue(9);
        System.out.println("Priority Queue = " + pqueue.displayPQueue());
        pqueue.enqueue(7);
        System.out.println("Priority Queue = " + pqueue.displayPQueue());

        System.out.println("Peek() = " + pqueue.peek());

        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
        System.out.println(pqueue.dequeue());
    }
}
