package datastructure.tree.dfs;

import datastructure.tree.Node;

public class PreOrderTraversal {

    public void buildTree(Node root, int value) {

        if (value < root.data) {
            if (root.left != null) {
               // System.out.println("left tree " + root.left.data);
                buildTree(root.left, value);
            } else {
               // System.out.println(" left  " + value);
                root.left = new Node(value);
            }
        } else if (value > root.data) {
            if (root.right != null) {
               // System.out.println("right tree " + root.right.data);
                buildTree(root.right, value);
            } else {
             //   System.out.println(" right " + value);
                root.right = new Node(value);
            }
        }
    }

    // root -> left -> right
    public void preOrderSearch(Node root) {
        if (root == null) {
            return;
        }
        System.err.print(root.data + " -> ");
        preOrderSearch(root.left);
        preOrderSearch(root.right);
    }

}
