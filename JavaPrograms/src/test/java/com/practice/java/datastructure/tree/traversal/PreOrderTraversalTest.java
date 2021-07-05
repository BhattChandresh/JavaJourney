package com.practice.java.datastructure.tree.traversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PreOrderTraversalTest {
    PreOrderTraversal preOrderTraversal;
    TraversalUtils traversalUtils;

    @BeforeEach
    public void init() {
        preOrderTraversal = new PreOrderTraversal();
        traversalUtils = new TraversalUtils();
    }

    @Test
    void testTraverse() {
        Node root1 = traversalUtils.prepareTree1();
        preOrderTraversal.traverse(root1);
        assertEquals("4 -> 5 -> 7 -> 8 -> 10 -> 1 -> ", preOrderTraversal.preOrderTraversalPath);

        preOrderTraversal.preOrderTraversalPath = "";

        Node root2 = traversalUtils.prepareTree2();
        preOrderTraversal.traverse(root2);
        assertEquals("A -> B -> D -> C -> E -> G -> F -> H -> I -> ", preOrderTraversal.preOrderTraversalPath);
    }
}