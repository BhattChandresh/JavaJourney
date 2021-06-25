package com.practice.java.datastructure.circularlinkedlist;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class CircularLnkLstUtil {
    private Node first;
    private Node last;

    public CircularLnkLstUtil() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertAtBegining(int data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty())
            last = node;
        node.next = first;
        first = node;
    }

    public void insertAtEnd(int data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty())
            first = node;
        last.next = node;
        last = node;
    }

    public void deleteFirstNode() {
        Node current = first;
        if(first.next == null)
            last = null;
        first = current.next;
        current = null;
    }

    public void deleteLastNode() {
        Node current = first;
        Node temp = null;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        if(last.next == null) {
            last = null;
            last = temp;
            last.next = null;
        }
    }

    public void reverseList() {
        Node current = first;
        Node prev = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        current = first;
        while(current != null) {
            last = current;
            current = current.next;
        }
        System.out.println(first.data);
        System.out.println(last.data);
     }

    public void displayList() {
        System.out.println("list (First ----> Last)");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
 }
