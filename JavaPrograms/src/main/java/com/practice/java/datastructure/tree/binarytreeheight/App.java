package com.practice.java.datastructure.tree.binarytreeheight;

public class App {
    public static void main(String[] args) {
        BinaryTreeUtils binaryTree = new BinaryTreeUtils();
        App app = new App();
        Node root = app.prepareTree();
        int depth = binaryTree.findTreeHeight(root);
        System.out.println("Depth of Binary Tree is  = " + depth);
    }

    Node prepareTree() {
        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.leftNode.leftNode = new Node(4);
        root.rightNode = new Node(3);
        root.rightNode.leftNode = new Node(5);
        root.rightNode.rightNode = new Node(6);
        root.rightNode.rightNode.rightNode = new Node(7);
        root.rightNode.rightNode.rightNode.rightNode = new Node(8);
        return root;
    }
}
