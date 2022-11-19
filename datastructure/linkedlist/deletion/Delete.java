package datastructure.linkedlist.deletion;

import datastructure.linkedlist.Node;

public class Delete {
    Node head;
    Node tail;
    int size;

    public Delete(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    // delete operation
    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int data = head.data; // [head] -> [] -> [tail] -> null
        head = head.next;  // remove current ref  [head]
        size--;
        return data;
    }

    public int deleteLast() {
        if (tail == null) {
            return -1;
        }
        int data = tail.next.data;
        tail.next = null;
        size--;
        return data;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        Node lastIndexNode = getNode(index);
        int data = lastIndexNode.next.data;
        lastIndexNode.next = lastIndexNode.next.next;
        size--;
        return data;
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
