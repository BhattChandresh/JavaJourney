package main.java.com.practice.java.linkedlist;

public class RotateList {
    public static void main(String[] args) {

//        RotatedLinkedList rotatedLinkedList = new RotatedLinkedList(1);
//        rotatedLinkedList.appendNode(2);
//        rotatedLinkedList.appendNode(3);
//        rotatedLinkedList.appendNode(4);
//        rotatedLinkedList.appendNode(5);
//
//        rotatedLinkedList.rotateRight(rotatedLinkedList.getHead(), 2);
//        rotatedLinkedList.traverseList();

        RotatedLinkedList rotatedLinkedList = new RotatedLinkedList(0);
        rotatedLinkedList.appendNode(1);
        rotatedLinkedList.appendNode(2);
        rotatedLinkedList.rotateRightBruteForce(rotatedLinkedList.getHead(), 4);
        rotatedLinkedList.traverseList();

    }
}

class RotatedLinkedList {
    Node head;
    Node tail;
    int length;

    public RotatedLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void appendNode(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node getHead() {
        return head;
    }


    public void traverseList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println();
    }

    public RotatedLinkedList rotateRightBruteForce(Node head, int k) {

        //traverseList();
        for(int r=0 ; r < k; r++) {

            Node current = this.head;
            Node newHead = tail;
            int index = 0;
            Node newTail = null;

            while (current.next != null) {
                if (index == 0) {
                    newHead.next = current;
                }
                current = current.next;
                index++;
                if (index == length - 2) {
                    newTail = current;
                    //System.out.println("New Tail Value : " + newTail.value);
                    newTail.next = null;
                    tail = newTail;
                }
            }
            this.head = newHead;
            //traverseList();
        }
        return this;
    }


    class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.next = null;
            this.value = value;
        }
    }
}




