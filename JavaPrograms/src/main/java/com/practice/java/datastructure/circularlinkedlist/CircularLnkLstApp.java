package com.practice.java.datastructure.circularlinkedlist;

import com.practice.java.Author;

@Author("")
public class CircularLnkLstApp {
    public static void main(String[] args) {
        CircularLnkLstUtil lnkLstUtil = new CircularLnkLstUtil();
        System.out.println("Inserting the nodes at the beginning");
        lnkLstUtil.insertAtBeginning(100);
        lnkLstUtil.insertAtBeginning(200);
        lnkLstUtil.insertAtBeginning(300);
        lnkLstUtil.insertAtBeginning(400);
        lnkLstUtil.insertAtBeginning(500);
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Inserting the nodes at the end");
        lnkLstUtil.insertAtEnd(600);
        lnkLstUtil.insertAtEnd(700);
        lnkLstUtil.insertAtEnd(800);
        lnkLstUtil.insertAtEnd(900);
        lnkLstUtil.insertAtEnd(1000);
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Delete the first node");
        lnkLstUtil.deleteFirstNode();
        lnkLstUtil.deleteFirstNode();
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Delete the last node");
        lnkLstUtil.deleteLastNode();
        lnkLstUtil.deleteLastNode();
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Reverse the CircularLinkedList");
        lnkLstUtil.reverseList();
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Insert node at middle");
        lnkLstUtil.insertAtMiddle(450);
        lnkLstUtil.insertAtMiddle(550);
        lnkLstUtil.displayList();
        System.out.println();
        System.out.println("Delete node at middle");
        lnkLstUtil.deleteMiddle();
        lnkLstUtil.deleteMiddle();
        lnkLstUtil.deleteMiddle();
        lnkLstUtil.deleteMiddle();
        lnkLstUtil.displayList();
    }
}
