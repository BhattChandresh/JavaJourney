package com.practice.java.Testing;

public class Test {
    public static void main(String[] args) {
        Util util = new Util();

        util.insertAtBegin(10);
        util.insertAtBegin(20);
        util.insertAtBegin(30);
        util.insertAtBegin(40);
        util.displayList();

        util.insertAtLast(100);
        util.insertAtLast(200);
        util.insertAtLast(300);
        util.insertAtLast(400);
        util.displayList();

        util.deleteFirst();
        util.deleteFirst();
        util.displayList();

        util.deleteLast();
        util.deleteLast();
        util.displayList();

        util.insertAtBegin(50);
        util.displayList();

        util.reverse();
        util.displayList();
    }
}

class Util {
    Node first;
    Node last;

    Util() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertAtBegin(int data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty())
            last = node;
        node.next = first;
        first = node;
    }

    public void deleteFirst() {
        Node temp = first;
        first = first.next;
        temp = null;
    }

    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty())
            first = node;
        last.next = node;
        last = node;
    }

    public void deleteLast() {
        Node current = first;
        Node temp = null;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        last = temp;
        last.next = null;
    }

    public void reverse() {
        Node prev = null;
        Node current = first;
        Node next = null;
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
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public void displayNode() {
        System.out.print(" { " + data + " }  -> ");
    }
}


//https://unraveldata.com/how-to-intelligently-monitor-kafka-spark-streaming-data-pipelines/



