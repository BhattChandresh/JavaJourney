package main.java.com.practice.java.linkedlist;

public class PrintList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(4);
        myLinkedList.appendNode(5);
        myLinkedList.appendNode(7);
        myLinkedList.traverseLinkedList();
    }
}

class MyLinkedList {

    private final Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void appendNode(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length += 1;
    }

    public void traverseLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
    }


    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}

