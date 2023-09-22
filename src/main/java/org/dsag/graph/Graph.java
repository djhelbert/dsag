package org.dsag.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph Data Structure
 */
public class Graph {
    public List<Vertex> vertices = new ArrayList<>();

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Vertex from, Vertex to) {
        from.addAdjacent(to);
    }

    public boolean hasCycle(Vertex v) {
        v.currentPath = true;

        for (Vertex neighbor : v.adjacent) {
            if (neighbor.currentPath) {
                return true;
            } else if (!neighbor.visited && hasCycle(neighbor)) {
                return true;
            }
        }

        v.visited = true;      // Visited vertex
        v.currentPath = false; // No longer currently being visited

        return false;
    }

    public boolean hasCycle() {
        for (Vertex vertex : vertices) {
            if (!vertex.visited && hasCycle(vertex)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");

        Graph graph = new Graph();
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);

        graph.addEdge(vertexA, vertexB);
        graph.addEdge(vertexB, vertexC);
        graph.addEdge(vertexC, vertexA);
        graph.addEdge(vertexD, vertexC);

        System.out.println(graph.hasCycle());

        vertexA = new Vertex("A");
        vertexB = new Vertex("B");
        vertexC = new Vertex("C");
        vertexD = new Vertex("D");

        Graph graphNoCycle = new Graph();
        graphNoCycle.addVertex(vertexA);
        graphNoCycle.addVertex(vertexB);
        graphNoCycle.addVertex(vertexC);
        graphNoCycle.addVertex(vertexD);

        graphNoCycle.addEdge(vertexA, vertexB);
        graphNoCycle.addEdge(vertexB, vertexC);
        graphNoCycle.addEdge(vertexC, vertexD);

        System.out.println(graphNoCycle.hasCycle());
    }
}
