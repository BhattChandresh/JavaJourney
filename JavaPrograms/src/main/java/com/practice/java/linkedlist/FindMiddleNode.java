package main.java.com.practice.java.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleNode {
    public static void main(String[] args) {
        MiddleNode middleNode = new MiddleNode(1);
        middleNode.appendNode(2);
        middleNode.appendNode(3);
        middleNode.appendNode(4);
        middleNode.appendNode(5);
        middleNode.appendNode(6);
        middleNode.traverseList();
        System.out.println("Middle Node when there is no length functionality is present : " + middleNode.getMiddelNodeWhenLengthVariableIsNotDefined());
    }
}


class MiddleNode {
    private final Node head;
    private Node tail;

    public MiddleNode(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
    }


    int getMiddelNodeWhenLengthVariableIsNotDefined() {
        List<Integer> list = new ArrayList<>();
        Node current = head;

        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list.get(list.size() / 2);
    }


    void appendNode(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    void traverseList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println();
    }

    class Node {
        private Node next;
        private final int value;

        public Node(int value) {
            this.next = null;
            this.value = value;
        }
    }
}
