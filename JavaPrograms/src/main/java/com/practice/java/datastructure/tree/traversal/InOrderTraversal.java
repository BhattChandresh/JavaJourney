package com.practice.java.datastructure.tree.traversal;

public class InOrderTraversal {
    String inOrderTraversalPath = "";

    public static void main(String[] args) {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        TraversalUtils traversalUtils = new TraversalUtils();

        Node root1 = traversalUtils.prepareTree1();
        inOrderTraversal.traverse(root1);
        System.out.println();
        Node root2 = traversalUtils.prepareTree2();
        inOrderTraversal.traverse(root2);

    }

    protected void traverse(Node root) {
        if (root == null) {
            return;
        }
        traverse(root.leftNode);
        inOrderTraversalPath = inOrderTraversalPath + root.data + " -> ";
        traverse(root.rightNode);
    }
}


