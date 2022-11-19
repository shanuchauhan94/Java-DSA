package datastructure.tree.BT;

import datastructure.tree.Node;

public class BTDelete {

    public Node deleteNode(Node root, int key) {

        if (root == null) return null;

        if (key > root.data) {  // right move
            root.right = deleteNode(root.right, key);
        } else if (key < root.data) { // left move
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = deleteNode(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = deleteNode(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
