package com.practice.java.datastructure.circularlinkedlist;

import com.practice.java.Author;

@Author("")
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.print("{ " + data + " } ->");
    }
}
