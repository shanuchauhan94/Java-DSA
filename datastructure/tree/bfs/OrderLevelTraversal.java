package datastructure.tree.bfs;

import datastructure.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

// Breadth First Search
public class OrderLevelTraversal {

    //used queue (FIFO)  BFS
    public void orderLevelSearch(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node nodeR = queue.remove();  // root
            if (nodeR == null) {
                return;
            } else {
                // preOrder
                System.err.print(nodeR.data + " ");
                if (nodeR.left != null) {
                    queue.add(nodeR.left);
                }
                if (nodeR.right != null) {
                    queue.add(nodeR.right);
                }
            }
        }
    }

    public void orderLevelSearch2(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);  // next line    [1|null|2|3|null| .......]
        while (!queue.isEmpty()) {
            Node nodeR = queue.remove();  // root
            if (nodeR == null) {
                System.err.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                // preOrder
                System.err.print(nodeR.data + " ");
                if (nodeR.left != null) {
                    queue.add(nodeR.left);
                }
                if (nodeR.right != null) {
                    queue.add(nodeR.right);
                }
            }
        }
    }
}
