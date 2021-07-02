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
        //int[] inputArr = {1, 2, 3, 4};
        //int[] inputArr = {1, 2, 3, 4, 5};
        //int[] inputArr = {35,44,56,12,99,201,5}; //[35, 5, 44, 201, 56, 99, 12]
        int[] inputArr = {15, 30, 45, 60, 75, 90, 105, 120, 135, 150};   //[15, 150, 30, 135, 45, 120, 60, 105, 75, 90]
        //int[] inputArr = {2, 4, 8, 16, 32, 64, 128, 512, 1024, 2048, 4096, 8192, 16384}; //[2, 16384, 4, 8192, 8, 4096, 16, 2048, 32, 1024, 64, 512, 128]
        list.prepareList(inputArr);
        list.displayList();
        System.out.println();
        list.reorderListWorkingSolution(list.getHead());
        list.displayList();
    }
}
