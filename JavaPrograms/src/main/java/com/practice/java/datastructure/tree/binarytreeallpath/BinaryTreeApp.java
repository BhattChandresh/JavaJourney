/*
                                                                                               2
                                                                                       /                \
                                                                                      7                  5
                                                                                     /   \                    \
                                                                                  12    6                   9
                                                                                           /  \
                                                                                          5    11
 */


package com.practice.java.datastructure.tree.binarytreeallpath;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTreeApp app = new BinaryTreeApp();
        BinaryTreeUtils bt = new BinaryTreeUtils();
        Node root = app.prepareTree();
        bt.getAllPathsFromRootToLeaf(root);
        System.out.println("Longest Path in Tree is :");
        for (int index = 0; index < bt.longestPath.length; index++) {
            System.out.print(bt.longestPath[index] + " ");
        }
    }

    private Node prepareTree() {
        Node root = new Node(2);
        root.rightNode = new Node(5);
        root.rightNode.rightNode = new Node(9);
        root.leftNode = new Node(7);
        root.leftNode.leftNode = new Node(12);
        root.leftNode.rightNode = new Node(6);
        root.leftNode.rightNode.leftNode = new Node(5);
        root.leftNode.rightNode.rightNode = new Node(11);
        return root;
    }
}
