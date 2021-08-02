package com.practice.java.interviewcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxCheese {
    public static void main(String[] args) {
        MaxCheese maxCheese = new MaxCheese();
        int[] cheeseBlocks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Cheese Blocks :");
        int noOfCheeseBlocks = sc.nextInt();
        cheeseBlocks = new int[noOfCheeseBlocks];
        for(int index=0; index < noOfCheeseBlocks;index++) {
            int cheeseBlock = sc.nextInt();
            cheeseBlocks[index] = cheeseBlock;
        }
        sc.close();
        int maxCheeseGetByMouse = maxCheese.getMaxCheeseByMouse(cheeseBlocks);
        System.out.println("Maximum cheese Eat By Mouse = " + maxCheeseGetByMouse + " Kg");
    }

    protected int getMaxCheeseByMouse(int[] cheeseBlocks) {
        List<Integer> weightIndex = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());  //Intention : Use Max Heap Data Structure to get the max. element
        int maxCheeseGetByMouse = 0;

        for (int cheeseBlock : cheeseBlocks) {
            weightIndex.add(cheeseBlock);
            priorityQueue.add(cheeseBlock);
        }

        int maxWeightCheeseBlock = 0;
        int index;
        while (!priorityQueue.isEmpty()) {
            if (priorityQueue.peek() != null) {
                maxWeightCheeseBlock = priorityQueue.peek();
            }

            index = weightIndex.indexOf(maxWeightCheeseBlock);
            priorityQueue.poll();
            weightIndex.set(index, Integer.MIN_VALUE); //If cheese blocks of same wait  but not consecutive  then calculation may be wrong so replace the  first value.
            if ((index + 1) < priorityQueue.size()) {    //Check the Upper Bound. If cheese block is last then don't go to discard the next element.
                priorityQueue.remove(cheeseBlocks[index + 1]);
            }
            if ((index - 1) >= 0) { //Check the Lower Bound. If cheese block is first  then don't go to discard the previous element.
                priorityQueue.remove(cheeseBlocks[index - 1]);
            }
            maxCheeseGetByMouse = maxCheeseGetByMouse + maxWeightCheeseBlock;

        }
        return maxCheeseGetByMouse;
    }
}
