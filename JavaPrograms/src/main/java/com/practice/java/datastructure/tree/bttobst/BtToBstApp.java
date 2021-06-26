package com.practice.java.datastructure.tree.bttobst;

public class BtToBstApp {
    public static void main(String[] args) {
        BtToBstApp app = new BtToBstApp();
        BtToBstUtils utils = new BtToBstUtils();
        Node root = app.prepareTree();
        utils.convertBinaryTreeToBinarySearchTree(root);
        utils.validation();
    }

    private Node prepareTree() {
        Node root = new Node(0);
        root.leftNode = new Node(1);
        root.leftNode.leftNode = new Node(3);
        root.leftNode.leftNode.rightNode = new Node(6);
        root.leftNode.leftNode.rightNode.rightNode = new Node(8);
        root.leftNode.rightNode = new Node(4);
        root.rightNode = new Node(2);
        root.rightNode.leftNode = new Node(5);
        root.rightNode.leftNode.rightNode = new Node(7);
        return root;
    }
}
