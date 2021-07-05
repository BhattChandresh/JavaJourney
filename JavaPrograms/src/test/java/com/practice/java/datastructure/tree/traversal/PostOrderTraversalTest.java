package com.practice.java.datastructure.tree.traversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostOrderTraversalTest {
    private PostOrderTraversal postOrderTraversal;
    private TraversalUtils traversalUtils;

    @BeforeEach
    public void init() {
        postOrderTraversal = new PostOrderTraversal();
        traversalUtils = new TraversalUtils();
    }

    @Test
    void testTraverse() {
        Node root1 = traversalUtils.prepareTree1();
        postOrderTraversal.traverse(root1);
        assertEquals("7 -> 8 -> 5 -> 1 -> 10 -> 4 -> ", postOrderTraversal.postOrderTraversalPath);
        postOrderTraversal.postOrderTraversalPath = "";
        Node root2 = traversalUtils.prepareTree2();
        postOrderTraversal.traverse(root2);
        assertEquals("D -> B -> G -> E -> H -> I -> F -> C -> A -> ", postOrderTraversal.postOrderTraversalPath);
    }
}