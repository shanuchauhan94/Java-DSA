package datastructure.tree.dfs;

import datastructure.tree.Node;

// Depth First Search
public class InOrderTraversal {

    // left -> root -> right
    public void inOrderSearch(Node root) {

        if (root == null) {
            return;
        }
        inOrderSearch(root.left);
        System.err.print(root.data + " -> ");
        inOrderSearch(root.right);
    }
}
