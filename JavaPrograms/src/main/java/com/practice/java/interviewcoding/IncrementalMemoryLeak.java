/*
You are given two integers memory1 and memory2 representing the available memory in bits on two memory sticks
 There is currently a faulty program running that consumes an increasing amount of memory every second.
At the ith second (starting from 1), i bits of memory are allocated to the stick with more available memory
 (or from the first memory stick if both have the same available memory). If neither stick has at least i bits of available memory, the program crashes.
Return an array containing [crashTime, memory1crash, memory2crash],
where crashTime is the time (in seconds) when the program crashed and memory1crash and
memory2crash are the available bits of memory in the first and second sticks respectively.
 */

package com.practice.java.interviewcoding;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementalMemoryLeak {
    public static void main(String[] args) {
        int[] crashPoint;
        Scanner sc = new Scanner(System.in);
        int memoryOfStick1 = sc.nextInt();
        int memoryOfStick2 = sc.nextInt();
        sc.close();
        IncrementalMemoryLeak incrementalMemoryLeak = new IncrementalMemoryLeak();
        crashPoint = incrementalMemoryLeak.findCrashPoint(memoryOfStick1, memoryOfStick2);
        System.out.println(Arrays.toString(crashPoint));
    }

    protected int[] findCrashPoint(int memoryOfStick1, int memoryOfStick2) {
        int count = 1;
        while (memoryOfStick1 >= count || memoryOfStick2 >= count) {
            if (memoryOfStick1 == memoryOfStick2 || memoryOfStick1 > memoryOfStick2) {
                memoryOfStick1 = memoryOfStick1 - count;
            } else {
                memoryOfStick2 = memoryOfStick2 - count;
            }
            count += 1;
        }
        return new int[] {
            count, memoryOfStick1, memoryOfStick2
        } ;
    }
}
