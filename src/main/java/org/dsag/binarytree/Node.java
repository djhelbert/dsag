package org.dsag.binarytree;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return "Node: " + value;
    }
}
