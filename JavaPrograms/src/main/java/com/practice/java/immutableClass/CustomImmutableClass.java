package com.practice.java.immutableClass;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class CustomImmutableClass {
    public static void main(String[] args) {
        ImmutableCls ic1 = new ImmutableCls(10);
        ImmutableCls ic2 = ic1.modify(100);
        ImmutableCls ic3 = ic1.modify(10);
        System.out.println("ic1 == ic3 : ");
        System.out.print( ic1 == ic3);
        System.out.println();
        System.out.println("ic1 == ic2 : ");
        System.out.print(ic1 == ic2);

    }
}
