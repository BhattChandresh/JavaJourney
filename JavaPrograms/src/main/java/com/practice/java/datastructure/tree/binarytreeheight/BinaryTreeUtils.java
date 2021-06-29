package com.practice.java.datastructure.tree.binarytreeheight;

public class BinaryTreeUtils {
    private int leftHeight, rightHeight;
    int findTreeHeight(Node node) {
        if (node == null) {
            return 0;
        }
        leftHeight = findTreeHeight(node.leftNode);
        rightHeight = findTreeHeight(node.rightNode);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
