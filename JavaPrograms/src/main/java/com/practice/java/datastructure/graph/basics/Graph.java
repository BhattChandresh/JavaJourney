package com.practice.java.datastructure.graph.basics;

import java.util.ArrayList;

public class Graph {
    private final int verticesCount;
    private int edgesCount;
    private final ArrayList<Integer>[] adjacencyList; //Arrays of Integer List

    public Graph(int verticesCount) {
        this.verticesCount = verticesCount;
        this.edgesCount = 0;
        adjacencyList = new ArrayList[verticesCount];

        for (int index = 0; index < verticesCount; index++) {
            adjacencyList[index] = new ArrayList<>();
        }
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public int getEdgesCount() {
        return edgesCount;
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
        edgesCount += 1;
    }

    public Object[] adj(int src) {
        return adjacencyList[src].toArray();
    }
}
