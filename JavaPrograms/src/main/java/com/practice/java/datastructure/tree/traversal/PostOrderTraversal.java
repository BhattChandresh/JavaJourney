package com.practice.java.datastructure.tree.traversal;

public class PostOrderTraversal {
    String postOrderTraversalPath = "";

    public static void main(String[] args) {
        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        TraversalUtils traversalUtils = new TraversalUtils();

        Node root1 = traversalUtils.prepareTree1();
        postOrderTraversal.traverse(root1);
        System.out.println();
        Node root2 = traversalUtils.prepareTree2();
        postOrderTraversal.traverse(root2);
    }

    protected void traverse(Node root) {
        if (root == null) {
            return;
        }
        traverse(root.leftNode);
        traverse(root.rightNode);
        postOrderTraversalPath = postOrderTraversalPath + root.data + " -> ";
    }
}
