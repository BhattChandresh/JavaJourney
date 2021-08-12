package com.practice.java.interviewcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxCheese {
    public static void main(String[] args) {
        MaxCheese maxCheese = new MaxCheese();
        int[] cheeseBlocks;
        List<int[]> testCaseList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of test cases : ");
        int noOfTestCases = sc.nextInt();
        if (noOfTestCases < 1 || noOfTestCases > 200) {
            return;
        }

        for (int testCase = 0; testCase < noOfTestCases; testCase++) {
            System.out.println("Enter the no. of Cheese Blocks :");
            int noOfCheeseBlocks = sc.nextInt();
            if (noOfCheeseBlocks <= 0) {
                System.out.println("No of Cheese Blocks should be > 0");
                System.exit(0);
            }
            cheeseBlocks = new int[noOfCheeseBlocks];
            System.out.println("Enter Cheese Blocks weight :");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String lines = null;
            try {
                lines = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (lines == null) {
                System.out.println("Provide correct input");
                System.exit(0);
            }
            String[] chesseQueue = lines.trim().split("\\s+");
            int length = chesseQueue.length;
            if (length != noOfCheeseBlocks) {
                System.out.println("Provide correct input");
                System.exit(0);
            }
            for (int index = 0; index < chesseQueue.length; index++) {
                cheeseBlocks[index] = Integer.parseInt(chesseQueue[index]);
            }
            testCaseList.add(cheeseBlocks);
        }
        sc.close();

        for (int[] ints : testCaseList) {
            System.out.println("Given Cheese Blocks are :" + Arrays.toString(ints));
            int maxCheeseGetByMouse = maxCheese.getMaxCheeseByMouse(ints);
            System.out.println("Maximum cheese Eat By Mouse = " + maxCheeseGetByMouse + " Kg");
        }
    }


    protected int getMaxCheeseByMouse(int[] cheeseBlocks) {
        List<Integer> weightIndex = new ArrayList<>();
        List<Integer> sortedCheeseBlocks = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        List<Integer> removalList = new ArrayList<>();
        int maxCheeseGetByMouse = 0;
        boolean leftFlag;
        boolean rightFlag;

        if (cheeseBlocks.length == 0) {
            return maxCheeseGetByMouse;
        }

        for (int item : cheeseBlocks) {
            weightIndex.add(item);
        }

        while (true) {
            leftFlag = false;
            rightFlag = false;

            for (int pivot : removalList) {
                if (pivot == weightIndex.size() - 1) {
                    weightIndex.set(pivot, -5);
                    weightIndex.set(pivot - 1, -5);
                } else if (pivot == 0) {
                    weightIndex.set(pivot, -5);
                    weightIndex.set(pivot + 1, -5);
                } else {
                    weightIndex.set(pivot, -5);
                    weightIndex.set(pivot + 1, -5);
                    weightIndex.set(pivot - 1, -5);
                }
            }
            removalList.clear();
            sortedCheeseBlocks.clear();
            sortedCheeseBlocks.addAll(weightIndex);

            Integer breakCondition = weightIndex.stream().reduce(0, Integer::sum);
            if (breakCondition == (weightIndex.size() * -5)) {
                break;
            }

            sortedCheeseBlocks.sort(Collections.reverseOrder());
            int maxBlock = sortedCheeseBlocks.get(0);
            int maxBlockIndex = weightIndex.lastIndexOf(maxBlock);
            if ((maxBlockIndex == weightIndex.size() - 1) || (maxBlockIndex == 0)) {
                resultList.add(maxBlock);
                removalList.add(maxBlockIndex);
            } else {
                int prevItem = weightIndex.get(maxBlockIndex - 1);
                int nextItem = weightIndex.get(maxBlockIndex + 1);
                int sum = prevItem + nextItem;
                int leftSum = 0;
                int rightSum = 0;
                int prevPrevItem;
                int nextNextItem;

                if (sum > maxBlock) {
                    if ((maxBlockIndex - 2) >= 0) {
                        prevPrevItem = weightIndex.get(maxBlockIndex - 2);
                        if (prevPrevItem != -5) {
                            leftSum = maxBlock + prevPrevItem;
                            if (leftSum > sum) {
                                leftFlag = true;
                            }
                        }
                    }

                    if ((maxBlockIndex + 2) < weightIndex.size() - 1) {
                        nextNextItem = weightIndex.get(maxBlockIndex + 2);
                        if (nextNextItem != -5) {
                            rightSum = maxBlock + nextNextItem;
                            if (rightSum > sum) {
                                rightFlag = true;
                            }
                        }
                    }
                    if (leftFlag && !(rightFlag)) {
                        resultList.add(maxBlock);
                        resultList.add(weightIndex.get(maxBlockIndex - 2));
                        removalList.add(maxBlockIndex);
                        removalList.add(maxBlockIndex - 2);
                    } else if (!(leftFlag) && rightFlag) {
                        resultList.add(maxBlock);
                        resultList.add(weightIndex.get(maxBlockIndex + 2));
                        removalList.add(maxBlockIndex);
                        removalList.add(maxBlockIndex + 2);
                    } else if (leftFlag && rightFlag) {
                        if (leftSum > rightSum) {
                            resultList.add(maxBlock);
                            resultList.add(weightIndex.get(maxBlockIndex - 2));
                            removalList.add(maxBlockIndex);
                            removalList.add(maxBlockIndex - 2);
                        } else {
                            resultList.add(maxBlock);
                            resultList.add(weightIndex.get(maxBlockIndex + 2));
                            removalList.add(maxBlockIndex);
                            removalList.add(maxBlockIndex + 2);
                        }
                    } else {
                        resultList.add(weightIndex.get(maxBlockIndex + 1));
                        resultList.add(weightIndex.get(maxBlockIndex - 1));
                        removalList.add(maxBlockIndex + 1);
                        removalList.add(maxBlockIndex - 1);
                    }
                } else {
                    resultList.add(maxBlock);
                    removalList.add(maxBlockIndex);
                }
            }
        }  //while true ends here

        for (Integer integer : resultList) {
            maxCheeseGetByMouse = maxCheeseGetByMouse + integer;
        }
        return maxCheeseGetByMouse;
    }

    //This is old method and It has a bug.
    /*
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
     */
}


