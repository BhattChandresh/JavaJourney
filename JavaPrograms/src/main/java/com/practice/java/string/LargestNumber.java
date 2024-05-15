package main.java.com.practice.java.string;

import java.lang.instrument.ClassDefinition;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {

        String result = "";
        //int[] nums = {10,2};
        int[] nums = {3, 30, 34, 5, 9};


        LargestNumber largestNumber = new LargestNumber();
        result = largestNumber.largestNumber(nums);
        System.out.println("Largest Number is : " + result);
    }

    public String largestNumber(int[] nums) {
        String[] snums = new String[nums.length];
        for (int i = 0; i < nums.length; i ++){
            snums[i] = "" + nums[i];
        }

        Arrays.sort(snums, (a, b) -> {
            String atob = a + b;
            String btoa = b + a;
            return btoa.compareTo(atob);
        });

        String result = "";
        for (int i = 0; i < snums.length; i ++){
            result +=snums[i];
        }
        //remove front zeroes
        while (result.length() > 1){
            if (result.charAt(0) == '0')
                result = result.substring(1);
            else
                break;
        }
        return result;
    }//largestNumber
}
