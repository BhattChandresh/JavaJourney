package com.practice.java.datastructure.tree.basicbinarysearchtree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10, "ten");
        bst.insert(15, "fifteen");
        bst.insert(20, "twenty");
        bst.insert(5, "five");
        bst.insert(100, "hundred");

        System.out.println(bst.findMax().key);
        System.out.println(bst.findMin().key);
        System.out.println(bst.remove(10));

        //bst.displayTree();

    }
}
