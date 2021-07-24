package com.practice.java.datastructure.graph.basics;

public class App {
    public static void main(String[] args) {
        Graph myGraph = new Graph(5);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(0, 3);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(4, 0);
        myGraph.addEdge(4, 3);

        System.out.println("No of Vertexes = " + myGraph.getVerticesCount());
        System.out.println("No of EdgeCount = " + myGraph.getEdgesCount());

        Object[] values = myGraph.adj(0);
        StringBuilder output = new StringBuilder();
        for (Object value : values) {
            output.append(value).append("  ");
        }
        output = new StringBuilder(output.toString().trim());
        System.out.println("[ " + output + " ]");

    }
}

