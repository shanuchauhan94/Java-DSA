package datastructure.linkedlist.problems;

import datastructure.linkedlist.Node;

public class DetectLoop {

    public Node head;
    public Node tail;

    public int size;

    public DetectLoop(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public boolean isLoopExists() {
        Node current = head;
        while (current != null) {
            if (current.data == 1) {
                return true;
            } else {
                current.data = 1;
            }
            current = current.next;
        }
        return false;
    }
}
