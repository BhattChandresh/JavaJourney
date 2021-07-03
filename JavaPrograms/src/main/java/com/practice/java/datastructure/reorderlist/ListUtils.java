package com.practice.java.datastructure.reorderlist;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    private Node first;
    private Node last;
    List<Integer> desiredList;

    public ListUtils() {
        first = null;
        last = null;
        desiredList = new ArrayList<>();
    }

    private void insertItemAtEnd(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            last = first;
        }
        last.next = node;
        last = node;
    }

    protected Node getHead() {
        return first;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    protected void prepareList(int[] inputArr) {
        for (int i : inputArr) {
            insertItemAtEnd(i);
        }
    }

    protected void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    protected void reorderListWorkingSolution(Node head) {
        List<Integer> tempList = getNodeValues(head);
        reOrderNodeValue(tempList);
        deleteAllNodes();
        for (Integer integer : desiredList) {
            insertItemAtEnd(integer);
        }
    }

    //Used only for JUnit.
    protected List<Integer> getNodeValuesForTesting() {
        List<Integer> testList = new ArrayList<>();
        Node current = first;
        while (current != null) {
            testList.add(current.data);
            current = current.next;
        }
        return testList;
    }

    //Used only for JUnit.
    protected void clearDesiredList() {
        desiredList.clear();
    }

    protected void deleteAllNodes() {
        while (first != null) {
            Node current = first;
            first = current.next;
            current = null;
        }
    }

    private void reOrderNodeValue(List<Integer> tempList) {
        int start = 0;
        int end = tempList.size() - 1;
        if (tempList.size() % 2 == 0) {
            while (start < end) {
                desiredList.add(tempList.get(start));
                desiredList.add(tempList.get(end));
                start++;
                end--;
            }
        } else {
            while (start <= end) {
                desiredList.add(tempList.get(start));
                if (start != end) {
                    desiredList.add(tempList.get(end));
                }
                start++;
                end--;
            }
        }
    }

    private List<Integer> getNodeValues(Node head) {
        List<Integer> nodeValList = new ArrayList<>();
        Node current = head;
        while (current != null) {
            nodeValList.add(current.data);
            current = current.next;
        }
        return nodeValList;
    }

    protected void reorderListBySwapNodes(Node first) {
        Node node = getLastNode(first);
        deleteLastNode();
        Node current = first;
        node.next = current.next;
        current.next = node;
        current = node;
        while (true) {
            current = current.next;
            if (current.next != null) {
                node = getLastNode(first);
                deleteLastNode();
                if (current.next == null) {
                    current.next = node;
                    break;
                }
                node.next = current.next;
                current.next = node;
                current = node;
            } else {
                break;
            }
        }
    }

    private Node getLastNode(Node first) {
        Node current = first;
        while (current != null) {
            last = current;
            current = current.next;
        }
        return last;
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
}
