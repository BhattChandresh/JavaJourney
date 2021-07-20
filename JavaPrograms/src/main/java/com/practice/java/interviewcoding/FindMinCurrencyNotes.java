/*
  Find minimum number of currency notes and values that sum to given amount
 */
package com.practice.java.interviewcoding;

import java.util.*;

public class FindMinCurrencyNotes {
    static ArrayList<Integer> notes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.close();
        if (amount < 0) {
            System.out.println("Amount is negative");
            return;
        }
        notes.add(2000);
        notes.add(500);
        notes.add(200);
        notes.add(100);
        notes.add(50);
        notes.add(20);
        notes.add(10);
        notes.add(5);
        notes.add(1);
        getMinCurrencyNotes(notes, amount);
    }

    static void getMinCurrencyNotes(List<Integer> notes, int amount) {
        int i = 0;
        int value;
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (amount >= -1) {
            if (amount >= notes.get(i)) {
                if (!(map.containsKey(notes.get(i))))
                    map.put(notes.get(i), 1);
                else {
                    value = map.get(notes.get(i));
                    map.put(notes.get(i), value + 1);
                }
                amount = amount - notes.get(i);
                if (amount <= 0)
                    break;
            } else {
                i = i + 1;
            }
        }
        System.out.println(map);
    }
}

