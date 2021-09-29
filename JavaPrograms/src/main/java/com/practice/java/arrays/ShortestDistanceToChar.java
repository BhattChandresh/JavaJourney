/*
    Given a String S and character C that occurs in S, return an array of integers (shortest distance) from all chars to C.
    Example :
    S = "helloworld"
    C = 'o'
    output = [4,3,2,1,0,1,0,1,2,3]
 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortestDistanceToChar {
    public static void main(String[] args) {
        ShortestDistanceToChar distanceToChar = new ShortestDistanceToChar();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.isEmpty()) {
            System.out.println("Given String is Empty, terminating the program");
            System.exit(0);
        }
        String targetString = sc.nextLine();
        if(targetString.isEmpty()) {
            System.out.println("Target Character is Empty, terminating the program");
            System.exit(0);
        }
        sc.close();
        char targetChar = targetString.charAt(0);
        distanceToChar.getShortestDistanceFromTargetChar(input, targetChar);
        distanceToChar.getShortestDistanceFromTargetCharOptimize(input, targetChar);
    }

    Object getShortestDistanceFromTargetChar(String input, char targetChar) {
        List<Integer> listOfTargetCharsIndexes = new ArrayList<>();
        List<Integer> listOfShortestDistances = new ArrayList<>();
        int[] shortestDistances;

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == targetChar) {
                listOfTargetCharsIndexes.add(index);
            }
        }

        for (int index = 0; index < input.length(); index++) {
            int shortestDistance = 0;
            for (int index1 = 0; index1 < listOfTargetCharsIndexes.size(); index1++) {
                int distance = Math.abs(index - listOfTargetCharsIndexes.get(index1));
                if (index1 == 0) {
                    shortestDistance = distance;
                    continue;
                }
                shortestDistance = Math.min(distance, shortestDistance);
            }
            listOfShortestDistances.add(shortestDistance);
        }

        shortestDistances = new int[listOfShortestDistances.size()];

        for (int index = 0; index <= shortestDistances.length - 1; index++) {
            shortestDistances[index] = listOfShortestDistances.get(index);
        }
        return shortestDistances;
    }

    int[] getShortestDistanceFromTargetCharOptimize(String input, char targetChar) {
        List<Integer> targetChars = new ArrayList<>();
        List<Integer> shortestDistance = new ArrayList<>();
        List<Integer> distances = new ArrayList<>();
        int[] sDistance;

        for(int index=0; index < input.length();index++) {
            if(input.charAt(index) == targetChar) {
                targetChars.add(index);
            }
        }

        for(int index=0; index < input.length();index++) {
            for (Integer aChar : targetChars) {
                distances.add(Math.abs(index - aChar));
            }
            int min = Collections.min(distances);
            distances.clear();
            shortestDistance.add(min);
        }

        sDistance = new int[shortestDistance.size()];
        for(int index=0; index < shortestDistance.size();index++) {
            sDistance[index] = shortestDistance.get(index);
        }
        return sDistance;
    }
}
