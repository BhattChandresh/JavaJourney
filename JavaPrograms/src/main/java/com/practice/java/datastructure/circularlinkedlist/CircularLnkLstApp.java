package com.practice.java.datastructure.circularlinkedlist;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class CircularLnkLstApp {
    public static void main(String[] args) {
        CircularLnkLstUtil list = new CircularLnkLstUtil();
        // Insert the node at begining
        System.out.println("Inserting the nodes at the begin");
        list.insertAtBegining(100);
        list.insertAtBegining(200);
        list.insertAtBegining(300);
        list.insertAtBegining(400);
        list.insertAtBegining(500);
        list.displayList();
        //Insert the node at end
        System.out.println("Inserting the nodes at the end");
        list.insertAtEnd(600);
        list.insertAtEnd(700);
        list.insertAtEnd(800);
        list.insertAtEnd(900);
        list.insertAtEnd(1000);
        list.displayList();
        //Delete the first node
        System.out.println("Delete the first node");
        list.deleteFirstNode();
        list.deleteFirstNode();
        list.displayList();
        //Delete the last node
        System.out.println("Delete the last node");
        list.deleteLastNode();
        list.deleteLastNode();
        list.displayList();
        //Reverse the list
        System.out.println("Reverse the CircularLinkedList");
        list.reverseList();
        list.displayList();
    }
}
