package com.practice.java.interviewcoding;

import java.util.Arrays;

public class VedityTest {
    public static void main(String[] args) {
        int[] inputArr = {3, 4, 5, 6};
        int[] squareArr = Arrays.stream(inputArr).map((x) -> x * x).toArray();
        for (int index = squareArr.length; index > 0; index--) {
            System.out.println(Arrays.toString(Arrays.copyOf(squareArr, index)));
        }
    }
}


//Original Program:
/*
package com.practice.java.interviewcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VedityTest {
    public static void main(String[] args) {
        List<Integer> squareList = new ArrayList<>();
        int[] inputArr = {3, 4, 5, 6};
        int[] squareArr = Arrays.stream(inputArr).map((x) -> x * x).toArray();
        System.out.println(Arrays.toString(squareArr));

        for (int index = 0; index < squareArr.length; index++) {
            squareList.add(squareArr[index]);
        }

        for(int index=0; index<squareList.size();index++) {
            squareList.remove(squareList.size()-1);
            System.out.println(squareList);
        }
        System.out.println(squareList.get(0));
    }
}
 */