package com.practice.java.datastructure.reorderlist;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    private Node first;
    private Node last;
    List<Integer> desiredList = new ArrayList<>();

    private void insertItemAtEnd(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            last = first;
        }
        last.next = node;
        last = node;
    }

    public Node getHead() {
        return first;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void prepareList(int[] inputArr) {
        for (int i : inputArr) {
            insertItemAtEnd(i);
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

    public void reorderListWorkingSolution(Node head) {
        List<Integer> tempList = getNodeValues(head);
        reOrderNodeValue(tempList);
        deleteAllNodes();
        for (Integer integer : desiredList) {
            insertItemAtEnd(integer);
        }
    }

    public List<Integer> getNodeValuesForTesting() {
        List<Integer> testList = new ArrayList<>();
        Node current = first;
        while(current != null) {
            testList.add(current.data);
            current = current.next;
        }
        return testList;
    }

    protected void deleteAllNodes() {
        while(first != null) {
        Node current = first;
        first = current.next;
        current = null;
        }
    }

    private void reOrderNodeValue(List<Integer> tempList) {
        int start = 0;
        int end = tempList.size()-1;
        if(tempList.size() %2 == 0) {
            while (start < end) {
                desiredList.add(tempList.get(start));
                desiredList.add(tempList.get(end));
                start++;
                end--;
            }
        } else {
            while (start <= end) {
                desiredList.add(tempList.get(start));
                if(start != end) {
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
}
