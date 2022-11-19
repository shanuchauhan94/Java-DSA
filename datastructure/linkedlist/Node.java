package datastructure.linkedlist;

public class Node {

    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int val, Node pre) {
        this.data = val;
        this.prev = pre;
    }
}
