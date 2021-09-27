package com.practice.java.interviewquestions.whatistheoutput;

import java.util.ArrayList;
import java.util.List;

public class PassListToMethod {
    public static void main(String[] args) {
        printArrayList();
    }

    public static void printArrayList() {
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");

        System.out.println(myList.toString());  // Output: [A,B]

        modifyA(myList);
        System.out.println(myList.toString());  // Output: [A, B, C]

        modifyB(myList);
        System.out.println(myList.toString()); // Output: [A, B, C]

        modifyC(myList);
        System.out.println(myList.toString()); // []
    }

    private static void modifyA(List<String> myList) {
        myList.add("C");
    }

    private static void modifyB(List<String> myList) {
        myList = null;
    }

    private static void modifyC(List<String> myList) {
        myList.clear();
    }
}
