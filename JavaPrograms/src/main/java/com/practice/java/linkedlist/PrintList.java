package main.java.com.practice.java.linkedlist;

public class PrintList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(4);

        System.out.println("<----- Append Node ----->");
        myLinkedList.appendNode(5);
        myLinkedList.appendNode(7);
        myLinkedList.appendNode(10);
        System.out.println("Length of LinkedList : " + myLinkedList.getLength());
        myLinkedList.traverseLinkedList();

        System.out.println("<----- Remove Last ----->");
        myLinkedList.removeLast();
        //myLinkedList.removeLast();
        //myLinkedList.removeLast();
        //myLinkedList.removeLast(); This will cover the edge case where LinkedList has only one node.
        System.out.println("Length of LinkedList : " + myLinkedList.getLength());
        myLinkedList.traverseLinkedList();
    }
}

class MyLinkedList {

    private Node head;
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
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {

        if (head == null || length == 0) {
            return null;
        }

        Node current = head;
        Node newTail = head;
        while (current.next != null) {
            newTail = current;
            current = current.next;
        }
        tail = newTail;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    public void traverseLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println();
    }

    public int getLength() {
        return length;
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

