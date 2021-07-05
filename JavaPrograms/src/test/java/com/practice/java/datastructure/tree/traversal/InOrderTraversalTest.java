package com.practice.java.datastructure.tree.traversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InOrderTraversalTest {
    private InOrderTraversal inOrderTraversal;
    private TraversalUtils traversalUtils;

    @BeforeEach
    public void init() {
        inOrderTraversal = new InOrderTraversal();
        traversalUtils = new TraversalUtils();
    }

    @Test
    void testTraverse() {
        Node root1 = traversalUtils.prepareTree1();
        inOrderTraversal.traverse(root1);
        assertEquals("7 -> 5 -> 8 -> 4 -> 10 -> 1 -> ", inOrderTraversal.inOrderTraversalPath);
        inOrderTraversal.inOrderTraversalPath = "";
        Node root2 = traversalUtils.prepareTree2();
        inOrderTraversal.traverse(root2);
        assertEquals("B -> D -> A -> G -> E -> C -> H -> F -> I -> ", inOrderTraversal.inOrderTraversalPath);
    }
}