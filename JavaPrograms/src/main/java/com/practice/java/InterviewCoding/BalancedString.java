/**
 * AUTHOR : Bhatt Chandresh
 * Organisation : VMWare
 * Find out the given String is balanced or unbalanced.
 * -> "[{()}]" --> Balanced String i.e. Match each symbol in string and if we find opening and closing symbol then String is balanced
 * -> "[{()} " --> Unbalanced String. If above condition is not matched then it is unbalanced.
 * Testing done on:
 * [{}()]  -> Output : Balanced
 * [{()}] -> Output : Balanced
 * [{()} -> Output : Unbalanced
 * <()>{][} -> Output : Balanced
 */
package com.practice.java.InterviewCoding;

import com.practice.java.Author;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

@Author("Chandresh Bhatt")
public class BalancedString {
    static Map<Character, Character> map = new HashMap<Character, Character>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        prepareLookup();
        balanceOrUnbalanced(input);
    }

    static void balanceOrUnbalanced(String input) {
        boolean isBalanced = false;
        input = input.trim();
        Predicate<String> p = (s -> s.length() % 2 == 0);
        if (!(p.test(input))) {
            System.out.println("String is unbalanced because no of characters are not even , " + input.trim().length());
            return;
        }

        Character[] original = new Character[input.length()];
        Character[] result = new Character[input.length()];

        for (int i = 0; i < original.length; i++) {
            original[i] = input.charAt(i);
            result[i] = map.get(original[i]);
        }

        Arrays.sort(original);
        Arrays.sort(result);

        for (int i = 0; i < original.length; i++) {
            if (original[i].equals(result[i]))
                isBalanced = true;
            else {
                isBalanced = false;
                break;
            }
        }
        if (isBalanced)
            System.out.println("String is Balanced");
        else
            System.out.println("String is Unbalanced");
    }

    static void prepareLookup() {
        map.put('(', ')');
        map.put(')', '(');
        map.put('<', '>');
        map.put('>', '<');
        map.put('[', ']');
        map.put(']', '[');
        map.put('{', '}');
        map.put('}', '{');
    }
}







/* BELOW SOLUTION WAS PARTIALLY CORRECT */

//public class BalancedString {
//    static Map<Character,Character> map = new HashMap<Character,Character>();
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        sc.close();
//        prepareLookup();
//        balanceOrUnbalanced(input);
//    }
//
//    static void balanceOrUnbalanced(String input) {
//
//        input = input.trim();
//        Predicate<String> p = (s-> s.length() % 2 == 0);
//        if(!(p.test(input))) {
//            System.out.println("String is unbalanced because no of characters are not even" + input.trim().length() );
//        }
//
//        boolean isBalanced = false;
//        char [] c = input.toCharArray();
//        for(int index=0;index<c.length;index++) {
//            Character symbol = map.get(c[index]);
//            if((index > 0) && (isBalanced == false)){
//                System.out.println("Unbalanced");
//                break;
//            }
//            for(int index1=0;index1<c.length;index1++) {
//                System.out.println(symbol + " = " + c[index1]);
//                if(symbol.equals(c[index1])) {
//                    isBalanced = true;
//                    break;
//                }
//            }
//        }
//        if(isBalanced == true)
//            System.out.println("Balanced");
//        else
//            System.out.println("Unbalanced");
//    }
//
//    static void prepareLookup() {
//        map.put('[',']');
//        map.put(']','[');
//        map.put('{','}');
//        map.put('}','{');
//        map.put('(',')');
//        map.put(')','(');
//        map.put('<','>');
//        map.put('>','<');
//    }
//}
