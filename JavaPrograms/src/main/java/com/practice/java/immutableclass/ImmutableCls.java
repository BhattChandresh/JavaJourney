package com.practice.java.immutableclass;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public final class ImmutableCls {
    private int i;

    ImmutableCls(int i) {
        this.i = i;
    }

    public ImmutableCls modify(int i) {
        if (this.i == i) {
            System.out.println("No change in object State hence returning the same object");
            return this;
        } else {
            System.out.println("Object state change hence new object will be returned");
            return new ImmutableCls(i);
        }
    }
}
