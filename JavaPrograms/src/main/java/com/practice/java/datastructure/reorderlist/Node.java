package com.practice.java.datastructure.reorderlist;

public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void displayNode() {
        System.out.print("[ " + data + "  ] -> ");
    }
}
