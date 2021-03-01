package com.practice.java.Testing;

import java.util.*;

public class App3 {
    public static void main(String[] args) {

        String[] input = {"ABCADBA", "ABCABDABABBE", "Hello", "Mital", "Chandresh", "Geeks", "VMWare", "rudra", "vivan", "saischoolofexcellence"};
        for (int i = 0; i < input.length; i++) {
            m1(input[i]);
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    static void m1(String s) {
        Set set = new LinkedHashSet();
        ArrayList list = new ArrayList();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        int lastCharIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean isPresent = set.add(s.charAt(i));
            if (isPresent)
                lastCharIndex = i;
        }
        System.out.println("SET = " + set);
        System.out.println("LastCharIndex =" + lastCharIndex);

        String result = s.substring(0, lastCharIndex + 1);
        System.out.println("result = " + result);

        for (int i = 0; i < result.length(); i++) {
            map.put(result.charAt(i), i);
        }
        System.out.println("Count Char and its Index = " + map);

        Collection<Integer> values = map.values();
        Iterator itr = values.iterator();
        int[] myIndex = new int[values.size()];
        int i = 0;
        while (itr.hasNext()) {
            myIndex[i] = (int) itr.next();
            i++;
        }
        Arrays.sort(myIndex);
        System.out.println("MyIndex");
        System.out.print("{");
        for (int t = 0; t < myIndex.length; t++) {
            System.out.print(myIndex[t] + ",");
        }
        System.out.print("}");
        System.out.println();
        String finalStr = "";
        System.out.println(myIndex[0] + "  " + (myIndex[myIndex.length - 1]));
        finalStr = result.substring(myIndex[0], myIndex[myIndex.length - 1] + 1);
        System.out.println("Final Result = " + finalStr);
    }
}


//        for(int i=0; i < result.length();i++) {
//            if(! list.contains(result.charAt(i)))
//                list.add(result.charAt(i));
//            else {
//                int pos = list.indexOf(result.charAt(i));
//                list.remove(pos);
//                list.add(result.charAt(i));
//            }
//        }
//
//        for(int i=0; i < list.size();i++) {
//            finalStr = finalStr + list.get(i);
//        }
//        System.out.println(finalStr);