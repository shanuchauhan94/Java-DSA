package datastructure.linkedlist;

public class LLInsertDeleteOperation {

    Node head;
    Node tail;
    int size;

    // insert operation
    private void insertFirst(int val) {
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

    private void insertLast(int val) {
        // [head] -> [tail] -> ------- [newNode]
        Node newNode = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = newNode; // [head] -> [tail] ->  [newNode] -> null
        size++;
    }

    private void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
        }
        Node prevIndexNode = getNode(index); // [head] -> ---- [prevIndexNode] -> [tail] -> null
        // [head] -> ---- [prevIndexNode] -> [newNode] -> [tail] -> null
        prevIndexNode.next = new Node(val, prevIndexNode.next);
        size++;
    }

    // delete operation
    private int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int data = head.data; // [head] -> [] -> [tail] -> null
        head = head.next;  // remove current ref  [head]
        size--;
        return data;
    }

    private int deleteLast() {
        if (tail == null) {
            return -1;
        }
        int data = tail.next.data;
        tail.next = null;
        size--;
        return data;
    }

    private int delete(int index) {
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

    private void print() {
        Node current = head;
        while (current != null) {
            System.err.print(current.data + " -> ");
            current = current.next;
        }
        System.err.println("null");
    }

    public static void main(String[] args) {
        LLInsertDeleteOperation listDemo = new LLInsertDeleteOperation();
        // insert operation
        listDemo.insertFirst(2);
        listDemo.insertFirst(3);
        listDemo.insertFirst(5);
        listDemo.print();
        listDemo.insertLast(4);
        listDemo.print();
        listDemo.insert(7, 1);
        listDemo.print();
        listDemo.insert(9, 3);
        listDemo.print();
        // delete operation
        System.err.println("--------------------------------------");
        System.err.println("delete node  -> " + listDemo.deleteFirst());
        listDemo.print();
        System.err.println("delete node  -> " + listDemo.deleteLast());
        listDemo.print();
        System.err.println("delete node  -> " + listDemo.delete(2));
        listDemo.print();

    }

}
