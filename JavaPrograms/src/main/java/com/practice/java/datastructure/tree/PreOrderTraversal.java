package com.practice.java.datastructure.tree;

public class PreOrderTraversal {
    String preOrderTraversalPath = "";

    public static void main(String[] args) {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();

        Node rootNode1 = preOrderTraversal.prepareTree1();
        preOrderTraversal.traverse(rootNode1);
        System.out.println();
        Node rootNode2 = preOrderTraversal.prepareTree2();
        preOrderTraversal.traverse(rootNode2);
    }

    protected void traverse(Node root) {
        if (root == null) {
            return;
        }
        preOrderTraversalPath = preOrderTraversalPath + root.data + " -> ";
        traverse(root.leftNode);
        traverse(root.rightNode);
    }

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

class Node {
    Object data;
    Node leftNode;
    Node rightNode;

    public Node(Object data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}