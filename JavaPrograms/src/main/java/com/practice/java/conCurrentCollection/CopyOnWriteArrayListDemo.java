package com.practice.java.conCurrentCollection;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

@Author("Chandresh Bhatt")
public class CopyOnWriteArrayListDemo {
    public static void main(String... args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<String>();
        l1.addIfAbsent("AAA");
        l1.addIfAbsent("CCC");
        l1.addAll(al);
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("AAA");
        al1.add("EEE");
        l1.addAllAbsent(al1);
        System.out.println(l1);
    }
}
