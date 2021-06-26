package com.practice.java.datastructure.tree.bttobst;

import java.util.Arrays;

public class BtToBstUtils {
    int[] inOrder;
    int treeIndex = 0;
    StringBuilder sb = new StringBuilder();
    Node root;

    void convertBinaryTreeToBinarySearchTree(Node node) {
        if (node == null) {
            return;
        }
        createInOrderTraversalArray(node, 0);
        convertStringToArray(sb);
        sortInorderTraversalArray();
        changeNodeValues(node, 0);

    }

    private void convertStringToArray(StringBuilder sb) {
        inOrder = new int[sb.length()];
        for (int index = 0; index < sb.length(); index++) {
            inOrder[index] = Character.getNumericValue(sb.charAt(index));
        }
    }

    private void createInOrderTraversalArray(Node node, int index) {
        if (node == null) {
            return;
        }
        createInOrderTraversalArray(node.leftNode, index + 1);
        sb.append(node.data);
        createInOrderTraversalArray(node.rightNode, index + 1);
    }

    void sortInorderTraversalArray() {
        Arrays.sort(inOrder);
        for (int i = 0; i < inOrder.length; i++) {
            System.out.print(inOrder[i] + " ");
        }
        System.out.println();
    }

    void changeNodeValues(Node node, int index) {
        if (node == null) {
            return;
        }
        changeNodeValues(node.leftNode, index + 1);
        node.data = inOrder[treeIndex];
        treeIndex += 1;
        changeNodeValues(node.rightNode, index + 1);
        //Hardcoded for validation
        if (node.data == 5) {
            root = node;
        }
    }

    public void validation() {
        System.out.println(root.data);
        System.out.println(root.leftNode.data);
        System.out.println(root.leftNode.leftNode.data);
        System.out.println(root.leftNode.leftNode.rightNode.data);
        System.out.println(root.leftNode.leftNode.rightNode.rightNode.data);
        System.out.println(root.rightNode.data);

    }
}
