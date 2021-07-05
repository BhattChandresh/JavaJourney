package com.practice.java.datastructure.tree.traversal;

public class PreOrderTraversal {
    String preOrderTraversalPath = "";

    public static void main(String[] args) {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        TraversalUtils traversalUtils = new TraversalUtils();

        Node rootNode1 = traversalUtils.prepareTree1();
        preOrderTraversal.traverse(rootNode1);
        System.out.println();
        Node rootNode2 = traversalUtils.prepareTree2();
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
}
