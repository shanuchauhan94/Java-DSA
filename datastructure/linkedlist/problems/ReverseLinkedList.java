package datastructure.linkedlist.problems;

import datastructure.linkedlist.Node;

public class ReverseLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public ReverseLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void reverse() {

        // single node
        if (head == null || head.next == null) {
            return;
        }
        // 3 node prev current next  , need 3 key for each iteration
        Node prev = head;
        Node current = head.next;
        while (current.next != null) {
            // found next node
            Node next = current.next;
            current.next = prev;

            prev = current;   //  [current] -> [prev] -> [next]
            current = next;  //   [next] -> [current] -> [prev]
        }
        head.next = null;
        head = prev;
    }
}
