package org.dsag.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public String name;
    public List<Vertex> adjacent = new ArrayList<>();
    public boolean currentPath = false;
    public boolean visited = false;

    public Vertex(String name) {
        this.name = name;
    }

    public void addAdjacent(Vertex v) {
        adjacent.add(v);
    }

    @Override
    public String toString() {
        return "Vertex(" + name + ")";
    }
}
