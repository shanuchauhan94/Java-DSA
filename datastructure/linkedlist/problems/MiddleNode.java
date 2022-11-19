package datastructure.linkedlist.problems;

import datastructure.linkedlist.Node;

public class MiddleNode {

    public Node head;
    public Node tail;
    public int size;

    public MiddleNode(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void printMiddle() {
        if (head != null) {
            int length = getLengthOfLL();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is [" + temp.data + "]");
            System.out.println();
        }
    }

    public int getLengthOfLL() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }


}
