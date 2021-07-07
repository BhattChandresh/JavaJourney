package com.practice.java.interviewcoding;

import java.util.Arrays;
import java.util.Scanner;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        RobotReturnToOrigin robot = new RobotReturnToOrigin();
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();
        sc.close();
        boolean isOriginalPosition = robot.robotMovementToOriginal(moves);
        System.out.println(isOriginalPosition);
    }

    protected boolean robotMovementToOriginal(String moves) {
        int[] coordinates = new int[2];
        int length = moves.length();
        for(int index=0; index< length;index++) {
            char direction = moves.charAt(index);
            switch(direction) {
                case 'L':
                    coordinates[0] = coordinates[0] - 1;
                    break;
                case 'R':
                    coordinates[0] = coordinates[0] + 1;
                    break;
                case 'U':
                    coordinates[1] = coordinates[1] + 1;
                    break;
                case 'D':
                    coordinates[1] = coordinates[1] - 1;
                    break;
            }
        }
        System.out.println(Arrays.toString(coordinates));
        return coordinates[0] == 0 && coordinates[1] == 0;
    }
}
