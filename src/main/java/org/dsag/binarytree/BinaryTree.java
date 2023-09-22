package org.dsag.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Tree
 */
public class BinaryTree {
    private Node root;

    public BinaryTree(int val) {
        root = new Node(val);
    }

    public Node getRoot() {
        return root;
    }

    /**
     * Depth First Search
     * @param n
     * @param v
     * @return Node
     */
    public Node dfs(Node n, int v) {
        if(n == null) {
            return null;
        } else if(n.value == v) {
            return n;
        } else {
            if(v > n.value) {
                return dfs(n.right, v);
            } else {
                return dfs(n.left, v);
            }
        }
    }

    /**
     * Get Tree Height
     * @param n
     * @return int
     */
    public int height(Node n) {
        if(n == null) {
            return -1;
        } else {
            int left = 1 + height(n.left);
            int right = 1 + height(n.right);
            return Math.max(left, right);
        }
    }

    /**
     * Add Binary Tree Node
     * @param n
     * @param v
     * @return Node
     */
    public Node add(Node n, int v) {
        if(n == null) {
            n = new Node(v);
        } else {
            if(v < n.value) {
                n.left = add(n.left, v);
            } else if(v > n.value) {
                n.right = add(n.right, v);
            }
        }

        return n;
    }

    /**
     * Breadth First Search
     *
     * @param root
     * @param value
     * @return Node
     */
    private Node bfs(Node root, int value) {
        if(root == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();

        Node temp = root;

        while(temp != null) {
            if(temp.value == value) {
                return temp;
            }

            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }

            temp = q.poll();
        }

        return null;
    }

    private void printNode(Node n) {
        System.out.println(n.value);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(3);
        bt.add(bt.getRoot(), 1);
        bt.add(bt.getRoot(), 4);
        bt.add(bt.getRoot(), 2);
        bt.add(bt.getRoot(), 0);
        bt.add(bt.getRoot(), 5);
        bt.printNode(bt.getRoot());
        System.out.println("Height: " + bt.height(bt.getRoot()));
        System.out.println("DFS: " + bt.dfs(bt.getRoot(),2));
        System.out.println("BFS: " + bt.bfs(bt.getRoot(),5));
    }
}
