package com.practice.java.datastructure.priorityqueue;

import java.util.Arrays;

//TODO : This code needs optimization.
public class Pqueue {
    private final int[] arr;
    private int currentPosition = -1;

    public Pqueue(int capacity) {
        arr = new int[capacity];
        Arrays.fill(arr, Integer.MAX_VALUE);
    }

    //This function is used to insert the new data into the queue and then maintain the ordered array.
    //Priority is as per the highest number.
    protected void enqueue(int element) {
        if (currentPosition >= 999) {
            System.out.println("Queue is full");
            return;
        }
        currentPosition++;
        arr[currentPosition] = element;
        Arrays.sort(arr, 0, currentPosition + 1);
    }

    //This function is used to remove the element with the highest priority from queue.
    protected int dequeue() {
        if (currentPosition == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[currentPosition];
        arr[currentPosition] = Integer.MAX_VALUE;
        currentPosition--;
        return element;
    }

    //This function is used to get the highest priority element from queue without removing it from queue.
    protected int peek() {
        if (currentPosition == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[currentPosition];
    }

    String displayPQueue() {
        StringBuilder str = new StringBuilder();
        for (int index = 0; index < currentPosition + 1; index++) {
            str.append(arr[index]).append(" ");
        }
        return str.toString().trim();
    }
}
