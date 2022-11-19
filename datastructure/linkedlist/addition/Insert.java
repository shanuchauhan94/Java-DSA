package datastructure.linkedlist.addition;

import datastructure.linkedlist.Node;

public class Insert {
    public Node head;
    public Node tail;
    public int size;

    // insert operation
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        if (tail == null) {
            tail = head;
        }
        // [newNode] -> ----- [head] -> null
        newNode.next = head;    // [newNode] -> [head] -> null
        head = newNode; // [newNode] -> null
        size++;
    }

    public void insertLast(int val) {
        // [head] -> [tail] -> ------- [newNode]
        Node newNode = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = newNode; // [head] -> [tail] ->  [newNode] -> null
        size++;
    }

    public void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
        }
        Node prevIndexNode = getNode(index); // [head] -> ---- [prevIndexNode] -> [tail] -> null
        // [head] -> ---- [prevIndexNode] -> [newNode] -> [tail] -> null
        Node newNode = new Node(val, prevIndexNode.next);
        prevIndexNode.next = newNode;
        size++;
    }

    private Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.err.print(current.data + " -> ");
            current = current.next;
        }
        System.err.println("null");
    }

}
