package main.java.com.practice.java.arrays;

import java.util.Arrays;

public class FindMinAndMaxInArr {
    public static void main(String[] args) {

        FindMinAndMaxInArr minAndMaxInArr = new FindMinAndMaxInArr();

//        int[] myList1 = {5, 3, 8, 1, 6, 9};
//        int[] result1 = minAndMaxInArr.findMaxMin(myList1);
//        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

//        int[] myList2 = {-5, -3, -8, -1, -6, -9};
//        int[] result2 = minAndMaxInArr.findMaxMin(myList2);
//        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

//        int[] myList3 = {0, 0, 0, 0, 0};
//        int[] result3 = minAndMaxInArr.findMaxMin(myList3);
//        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

//        int[] myList4 = {100, 200, 300, 400, 500};
//        int[] result4 = minAndMaxInArr.findMaxMin(myList4);
//        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"


        //int[] array = {2,10,7,5,4,1,8,6}; //[10,1]
        int[] array = {0,-4,19,1,8,-2,-3,5}; //[19,-4]
        int[] result =  new int[2];

        result = minAndMaxInArr.findMaxMin(array);
        System.out.println(Arrays.toString(result));
    }

    public int[] findMaxMin(int[] array) {
        int[] result = new int[2];

        for(int t=0 ; t< array.length-1;t++) {
            if (t == 0) {
                if (array[t] > array[t+1]) {
                    result[1] = Math.min(array[t], array[t+1]);
                    result[0] = Math.max(array[t+1], array[t]);
                } else {
                    result[1] = Math.min(array[t+1], array[t]);
                    result[0] = Math.max(array[t], array[t+1]);
                }
                continue;
            }

            if (array[t] > array[t+1]) {
                result[1] = Math.min(result[1], array[t+1]);
                result[0] = Math.max(result[0], array[t]);
            } else {
                result[1] = Math.min(result[1], array[t]);
                result[0] = Math.max(result[0], array[t+1]);
            }
        }
        return result;
    }
}
