/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

For example:
1 -> 2 -> 3 -> 4 =====>  1 -> 4 -> 2 -> 3
1 -> 2 -> 3 -> 4 -> 5  =====>   1 -> 5 -> 2 -> 4 -> 3

 */
package com.practice.java.datastructure.reorderlist;

public class ReOrderListApp {
    public static void main(String[] args) {
        ListUtils list = new ListUtils();
        int[] inputArr = {};
        list.prepareList(inputArr);
        list.displayList();
        System.out.println();
        list.reorderListWorkingSolution(list.getHead());
        list.displayList();
    }
}
