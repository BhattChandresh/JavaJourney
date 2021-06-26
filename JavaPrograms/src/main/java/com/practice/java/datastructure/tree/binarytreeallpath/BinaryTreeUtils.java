package com.practice.java.datastructure.tree.binarytreeallpath;

public class BinaryTreeUtils {

    int previousLength = 0;
    int[] longestPath;

    void getAllPathsFromRootToLeaf(Node node) {
        if (node == null) {
            return;
        }

        int[] path = new int[10];
        getRootToLeaf(node, path, 0);
    }

    private void getRootToLeaf(Node node, int[] path, int index) {
        if (node == null) {
            return;
        }

        path[index] = node.data;

        if (node.leftNode == null && node.rightNode == null) {
            printPath(path, index);
        }

        getRootToLeaf(node.leftNode, path, index + 1);
        getRootToLeaf(node.rightNode, path, index + 1);
    }

    private void printPath(int[] path, int index) {

        if (!(previousLength >= index)) {
            longestPath = new int[index + 1];
            for (int i = 0; i <= index; i++) {
                longestPath[i] = path[i];
            }
            previousLength = index;
        }

        for (int i = 0; i <= index; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }
}
