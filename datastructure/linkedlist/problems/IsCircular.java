package datastructure.linkedlist.problems;

import datastructure.linkedlist.Node;

public class IsCircular {

    public Node head;
    public Node tail;

    public int size;

    public IsCircular(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    // last node will ref to head

    public boolean isCircularNode() {

        // An empty linked list is circular
        if (head == null) return true;

        Node node = head.next;
        while (node != null && node != head) {
            node = node.next;
        }
        return node == head;
    }

}
