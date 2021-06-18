package com.practice.java.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentDuplicates {
    public static void main(String[] args) {
        AdjacentDuplicates adjacentDuplicates = new AdjacentDuplicates();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        adjacentDuplicates.removeAdjacentDuplicatesChars(input);
    }

    String removeAdjacentDuplicatesChars(String input) {
        String result = "";
        int len = input.length();
        boolean isRepeat;
        int repeat;

        if (len < 1) {
            System.out.println("Given String is Empty");
            return result;
        }

        isRepeat = checkAdjacentDuplicates(input);
        if (!isRepeat) {
            System.out.println("Given Input String has no adjacent duplicates");
            return input;
        }

        List<Integer> indexes = new ArrayList<>();
        while (isRepeat) {
            indexes.clear();
            int length = input.length();
            for (int index = 0; index < length - 1; index++) {
                if ((input.charAt(index) == input.charAt(index + 1))) {
                    indexes.add(index);
                    indexes.add(index + 1);
                    repeat = index + 1;
                    for (int index1 = repeat; index1 < length - 1; index1++) {
                        if (input.charAt(repeat) == input.charAt(index1 + 1)) {
                            indexes.add(index1 + 1);
                        } else {
                            index = index1;
                            break;
                        }
                    }
                }
            }

            for (int index = 0; index < length; index++) {
                if (!indexes.contains(index)) {
                    result = result + input.charAt(index);
                }
            }

            isRepeat = checkAdjacentDuplicates(result);
            if (isRepeat) {
                input = result;
                result = "";
            }
        }
        return result;
    }

    private boolean checkAdjacentDuplicates(String input) {
        for (int index = 0; index < input.length() - 1; index++) {
            if (input.charAt(index) == input.charAt(index + 1)) {
                return true;
            }
        }
        return false;
    }
}


//        while(isRepeat) {
//            int length = input.length();
//            for (int index = 0; index < length - 1; index++) {
//                if (input.charAt(index) != input.charAt(index + 1)) {
//                    result = result + input.charAt(index);
//                    if (index + 1 == length - 1) {
//                        result = result + input.charAt(index + 1);
//                    }
//                } else {
//                    for (int index1 = index; index1 < length; index1++) {
//                        if (index1 == length - 1) {
//                            index = index1;
//                            break;
//                        }
//                        if (!(input.charAt(index1) == (input.charAt((index1) + 1)))) {
//                            index = index1;
//                            break;
//                        }
//                    }
//                }
//            }
//            isRepeat = checkAdjacentDuplicates(result);
//            if(isRepeat){
//                input = result;
//                result = "";
//            }
//        }
