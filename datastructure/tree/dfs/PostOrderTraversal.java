package datastructure.tree.dfs;

import datastructure.tree.Node;

public class PostOrderTraversal {

    //  left -> right -> root
    public void postOrderSearch(Node root) {
        if (root == null) {
            return;
        }
        postOrderSearch(root.left);
        postOrderSearch(root.right);
        System.err.print(root.data + " -> ");
    }
}
