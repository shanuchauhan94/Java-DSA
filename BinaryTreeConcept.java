import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeConcept {

    static int idx = -1;

    private static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);  //   root node
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    // root -> leftNode -> rightNode
    private static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.err.print(root.data + " ");
        preOrderTraversal(root.left);  // leftNode
        preOrderTraversal(root.right);  // rightNode
    }

    // leftNode -> root -> rightNode
    private static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.err.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // leftNode -> rightNode -> root
    private static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.err.print(root.data + " ");
    }

    //used queue (FIFO)  BFS
    private static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);  // next line    [1|null|2|3|null| .......]
        // traverse the queue]
        while (!q.isEmpty()) {
            Node nodeR = q.remove();  // get root
            if (nodeR == null) {
                System.err.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.err.print(nodeR.data + " ");
                if (nodeR.left != null) {
                    q.add(nodeR.left);
                }
                if (nodeR.right != null) {
                    q.add(nodeR.right);
                }
            }
        }

    }

    private static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    private static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return (leftSum + rightSum + root.data);
    }

    private static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // diameter = lTH(leftTree height) + rTH(rightTree height) +1;
    // time complexity O(n^2)
    // Approach 1
    private static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);
        int maxDia = Math.max(leftDiameter, rightDiameter);
        int treeDiaWithNode = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(treeDiaWithNode, maxDia);
    }

    // cal diameter & height at the same time;
    // time complexity O(n)
    // Approach 2
    static class TreeInfo {
        int dia;
        int ht;

        public TreeInfo(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    // time complexity O(n)
    private static TreeInfo diameterOfTree2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftT = diameterOfTree2(root.left);
        TreeInfo rightT = diameterOfTree2(root.right);
        // get diameter
        int dia1 = leftT.dia;
        int dia2 = rightT.dia;
        int dia3 = leftT.ht + rightT.ht + 1;  // total dia including  root node is sum of height of left and right node + 1
        // get height
        int myHt = Math.max(leftT.ht, rightT.ht) + 1;
        int myDia = Math.max(Math.max(dia1, dia2), dia3);
        return new TreeInfo(myDia, myHt);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};    //      1
        Node node = buildTree(arr);                                  //    2      3
        System.err.println(" preorder");
        preOrderTraversal(node);
        System.err.println(" ");
        System.err.println(" inorder");
        inOrderTraversal(node);
        System.err.println(" ");
        System.err.println(" postorder");
        postOrderTraversal(node);
        System.err.println(" ");
        System.err.println(" levelorder");
        levelOrderTraversal(node);
        System.err.println(" ");
        System.err.println(" no of nodes");
        System.err.println(countOfNodes(node));
        System.err.println(" ");
        System.err.println(" sum of nodes");
        System.err.println(sumOfNodes(node));
        System.err.println(" ");
        System.err.println(" height of datastructure.tree");
        System.err.println(heightOfTree(node));
        System.err.println(" ");
        System.err.println(" diameter(max distance b/w node) of datastructure.tree");
        System.err.println(diameterOfTree(node));
        System.err.println(" ");
        System.err.println(" diameter(max distance b/w node) 2 of datastructure.tree");
        System.err.println(diameterOfTree2(node).dia);
    }


}
