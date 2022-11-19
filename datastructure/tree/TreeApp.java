package datastructure.tree;

import datastructure.tree.BT.BTDelete;
import datastructure.tree.BT.BTInsert;
import datastructure.tree.bfs.OrderLevelTraversal;
import datastructure.tree.dfs.InOrderTraversal;
import datastructure.tree.dfs.PostOrderTraversal;
import datastructure.tree.dfs.PreOrderTraversal;

public class TreeApp {
    public static void main(String[] args) {

        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        Node root = new Node(9);
        preOrderTraversal.buildTree(root, 4);
        preOrderTraversal.buildTree(root, 2);
        preOrderTraversal.buildTree(root, 1);
        preOrderTraversal.buildTree(root, 5);
        preOrderTraversal.buildTree(root, 7);
        preOrderTraversal.preOrderSearch(root);

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        System.err.println("");
        postOrderTraversal.postOrderSearch(root);

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        System.err.println("");
        inOrderTraversal.inOrderSearch(root);

        OrderLevelTraversal orderLevelTraversal = new OrderLevelTraversal();
        System.err.println("");
        orderLevelTraversal.orderLevelSearch(root);
        System.err.println();

        // insert in Binary Tree
        System.err.println("BT insert");
        BTInsert insert = new BTInsert();
        Node insertN = insert.insertNode(new Node(9), 3);
        inOrderTraversal.inOrderSearch(insertN);

        System.err.println();
        // insert in Binary Tree
        System.err.println("BT delete");
        BTDelete delete = new BTDelete();
        Node deleteN = delete.deleteNode(new Node(9), 0);
        inOrderTraversal.inOrderSearch(deleteN);

    }
}
