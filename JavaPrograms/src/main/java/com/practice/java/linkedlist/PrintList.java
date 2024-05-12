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

        System.out.println("<----- Prepend Node ----->");
        myLinkedList.prependNode(25);
        myLinkedList.traverseLinkedList();
        myLinkedList.prependNode(30);
        myLinkedList.traverseLinkedList();

        System.out.println("<----- Remove First Node ----->");
        System.out.println("Remove Node is : " + myLinkedList.removeFirst().value);
        myLinkedList.traverseLinkedList();
        System.out.println("Removed Node is : " + myLinkedList.removeFirst().value);
        myLinkedList.traverseLinkedList();

        System.out.println("-----------------------------------------------------------");
        myLinkedList.prependNode(45);
        myLinkedList.appendNode(50);
        myLinkedList.traverseLinkedList();

        System.out.println("<----- Get Node at Particular Index ----->");
        System.out.println(myLinkedList.getNode(4).value);
        System.out.println(myLinkedList.getNode(0).value);
        System.out.println(myLinkedList.getNode(2).value);

        System.out.println("<----- Set / Change Node Value at Particular Index ----->");
        System.out.println(myLinkedList.set(-1, 80));
        System.out.println(myLinkedList.set(0, 60));
        System.out.println(myLinkedList.set(4, 80));
        System.out.println(myLinkedList.set(3, 25));
        myLinkedList.traverseLinkedList();

        System.out.println("<----- Insert Node at Particular Index ----->");
        System.out.println(myLinkedList.insertNode(3, 100));
        myLinkedList.traverseLinkedList();

        System.out.println("<----- Remove Node at Particular Index ----->");
        System.out.println(myLinkedList.removeNode(4).value);
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

    public boolean set(int index, int value) {
        Node current = getNode(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
    }

    public Node removeFirst() {

        if (head == null || length == 0) {
            System.out.println("Linked List is empty");
            return null;
        }
        Node current = head;
        head = current.next;
        current.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return current;
    }

    public void prependNode(int value) {
        Node newNode = new Node(value);

        if (head == null || length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            newNode.next = current;
            head = newNode;
        }
        length++;
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

    public Node getNode(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index is out of range, Length of the Linked List is " + length);
            return null;
        }

        Node current = head;
        for(int t=0; t < index; t++) {
            current = current.next;
        }
        return current;
    }

    public int getLength() {
        return length;
    }

    public boolean insertNode(int index, int value) {

        if (index < 0 || index > length) {
            System.out.println("Index is out of range, " + index);
            return false;
        }

        if(index == 0) {
            prependNode(value);
            return true;
        }

        if(index == length) {
            appendNode(value);
            return true;
        }

        Node newNode = new Node(100);
        Node previousNode = getNode(index -1);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        length++;
        return true;
    }

    public Node removeNode(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index is out of range");
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node previousNode = getNode(index - 1);
        Node nodeToRemove = previousNode.next;

        previousNode.next = nodeToRemove.next;
        nodeToRemove.next = null;
        length--;
        return nodeToRemove;
    }

    public void reverseLinkedList() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int t=0 ; t < length; t++) {
            after = temp.next;  // Points to the next node.
            temp.next = before; // points to before which is null in first iteration.
            before = temp; //points to the head of the list in first iteration.
            temp = after; // move the temp to after points to 2nd node.
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

