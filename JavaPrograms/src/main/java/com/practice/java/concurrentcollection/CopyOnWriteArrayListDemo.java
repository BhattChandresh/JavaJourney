package com.practice.java.concurrentcollection;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

@Author("")
public class CopyOnWriteArrayListDemo {
    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("AAA");
        al.add("BBB");
        CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<>();
        l1.addIfAbsent("AAA");
        l1.addIfAbsent("CCC");
        l1.addAll(al);
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("AAA");
        al1.add("EEE");
        l1.addAllAbsent(al1);
        System.out.println(l1);
    }
}
