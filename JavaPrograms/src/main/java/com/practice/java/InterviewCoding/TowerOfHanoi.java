/**
 * Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
 * 1) Only one disk can be moved at a time.
 * 2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 * 3) No disk may be placed on top of a smaller disk.
 */

package com.practice.java.InterviewCoding;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Author("Chandresh Bhatt")
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disks = sc.nextInt();
        sc.close();

        //Method-1 Iterative Approach
        towerOfHanoi(disks, 'A', 'B', 'C');
    }

    static void towerOfHanoi(int disks, char from_rod, char to_rod, char aux_rod) {
        int n = (int) Math.pow(2, disks);
        System.out.println(n);
        System.out.println("---------------------------------------------------");
        List<Integer> diskAtFromRoad = new ArrayList<Integer>();
        List<Integer> diskAtToRoad = new ArrayList<Integer>();
        List<Integer> diskAtAuxRoad = new ArrayList<Integer>();
        diskAtFromRoad.add(4);
        diskAtFromRoad.add(3);
        diskAtFromRoad.add(2);
        diskAtFromRoad.add(1);
        System.out.println("Initial Position");
        illustratePos(from_rod, diskAtFromRoad, to_rod, diskAtToRoad, aux_rod, diskAtAuxRoad);
        System.out.println("---------------------------------------------------");
//        for(int i=0; i < n-1;i++) {
//            diskAtAuxRoad.add(diskAtFromRoad.get(i));
//            diskAtFromRoad.remove(i);
//            illustratePos(from_rod,diskAtFromRoad,to_rod,diskAtToRoad,aux_rod,diskAtAuxRoad);
//            break;
//        }
    }

    static void illustratePos(char from_rod, List diskAtFromRod, char to_rod, List diskAtToRod, char aux_rod, List diskAtAuxRod) {
        System.out.println("A" + "\t\t\t\t\t" + "B" + "\t\t\t\t\t" + "C");
        String fromRodPos = "";
        String toRodPos = "";
        String auxRodPos = "";
        for (int i = 0; i < diskAtFromRod.size(); i++) {
            fromRodPos = fromRodPos + "D-" + diskAtFromRod.get(i) + "\n";
        }
        for (int i = 0; i < diskAtToRod.size(); i++) {
            toRodPos = toRodPos + "D-" + diskAtToRod.get(i) + "\n";
        }
        for (int i = 0; i < diskAtAuxRod.size(); i++) {
            auxRodPos = auxRodPos + "D-" + diskAtAuxRod.get(i);
        }
        System.out.println(fromRodPos + "\t\t" + toRodPos + "\t\t" + auxRodPos);
    }
}
