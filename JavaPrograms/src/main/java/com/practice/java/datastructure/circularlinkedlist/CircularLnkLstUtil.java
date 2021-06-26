package com.practice.java.datastructure.circularlinkedlist;

import com.practice.java.Author;

@Author("")
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

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        if (isEmpty())
            last = node;
        node.next = first;
        first = node;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            last = first;
        }
        last.next = node;
        last = node;
    }

    public void deleteFirstNode() {
        Node current = first;
        if (isEmpty()) {
            return;
        }
        if (first.next == null) {
            last = null;
        }
        first = current.next;
    }

    public void deleteLastNode() {
        if (isEmpty()) {
            return;
        }

        Node current = first;
        Node temp = null;

        if (current.next == null) {
            last = null;
            first = null;
            return;
        }

        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        if (last.next == null) {
            last = null;
            last = temp;
            last.next = null;
        }
    }

    public void reverseList() {
        Node current = first;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        current = first;
        while (current != null) {
            last = current;
            current = current.next;
        }
        System.out.println(first != null ? first.data : 0);
        System.out.println(last.data);
    }

    public void displayList() {
        System.out.println("list (First ----> Last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertAtMiddle(int data) {
        int length = 0;
        if (isEmpty()) {
            Node node = new Node(data);
        } else {
            Node newNode = new Node(data);
            Node current = first;
            while (current != null) {
                length += 1;
                current = current.next;
            }

            int position = (length % 2 == 0) ? length / 2 : (length + 1) / 2;
            current = first;
            int currentPosition = 1;
            while (true) {
                current = current.next;
                currentPosition += 1;
                if (currentPosition == position) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
            }
        }
    }

    public void deleteMiddle() {
        int length = 0;
        Node current = first;
        while (current != null) {
            length += 1;
            current = current.next;
        }
        int position;

        position = (length / 2) + 1;

        current = first;
        int currentPosition = 1;
        while (true) {
            current = current.next;
            currentPosition += 1;
            if (position - 1 == currentPosition) {
                current.next = current.next.next;
                break;
            }
        }
    }
}
