package com.practice.java.dataStructure.circularLinkedList;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class Node {
    public int data;
    public Node next;

    public void displayNode() {
        System.out.print("{ " + data + " } ->");
    }
}
