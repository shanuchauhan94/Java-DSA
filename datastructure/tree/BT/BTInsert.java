package datastructure.tree.BT;

import datastructure.tree.Node;

public class BTInsert {

    public Node insertNode(Node root, int val) {

        if (root == null) return null;
        if (val < root.data) { // left move
            if (root.left != null) {
                insertNode(root.left, val);
            } else {
                root.left = new Node(val);
                System.out.println("  Inserted " + val + " to left of Node " + root.data);
            }
        }
        if (val > root.data) { // right move
            if (root.right != null) {
                insertNode(root.right, val);
            } else {
                System.out.println("  Inserted " + val + " to right of Node " + root.data);
                root.right = new Node(val);
            }
        }
        return root;
    }

}
