package com.practice.java.datastructure.tree.traversal;

public class TraversalUtils {
    protected Node prepareTree1() {
        Node root = new Node(4);
        root.leftNode = new Node(5);
        root.leftNode.leftNode = new Node(7);
        root.leftNode.rightNode = new Node(8);
        root.rightNode = new Node(10);
        root.rightNode.rightNode = new Node(1);
        return root;
    }

    protected Node prepareTree2() {
        Node root = new Node("A");
        root.leftNode = new Node("B");
        root.leftNode.rightNode = new Node("D");
        root.rightNode = new Node("C");
        root.rightNode.leftNode = new Node("E");
        root.rightNode.leftNode.leftNode = new Node("G");
        root.rightNode.rightNode = new Node("F");
        root.rightNode.rightNode.leftNode = new Node("H");
        root.rightNode.rightNode.rightNode = new Node("I");
        return root;
    }
}
