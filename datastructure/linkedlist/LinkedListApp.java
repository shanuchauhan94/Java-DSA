package datastructure.linkedlist;

import datastructure.linkedlist.addition.Insert;
import datastructure.linkedlist.deletion.Delete;
import datastructure.linkedlist.problems.DetectLoop;
import datastructure.linkedlist.problems.IsCircular;

public class LinkedListApp {

    public static void main(String[] args) {
        // insert operation
        Insert insert = new Insert();
        insert.insertFirst(2);
        insert.insertFirst(3);
        insert.insertFirst(5);
        insert.print();
        insert.insertLast(4);
        insert.print();
        insert.insert(7, 1);
        insert.print();
        insert.insert(9, 3);
        insert.print();
        // delete operation
        Delete delete = new Delete(insert.head, insert.tail, insert.size);
        System.err.println("--------------------------------------");
        System.err.println("delete node  -> " + delete.deleteFirst());
        delete.print();
        System.err.println("delete node  -> " + delete.deleteLast());
        delete.print();
        System.err.println("delete node  -> " + delete.delete(2));
        delete.print();
        // detect loop
        System.err.println("************isLoop************");
        insert.print();
        // Create loop for testing
        //insert.head.next.next.next.next = insert.head;
        DetectLoop loop = new DetectLoop(insert.head, insert.tail, insert.size);
        boolean isLoop = loop.isLoopExists();
        System.err.println("isLoop exists " + isLoop);
        // isCircular
        System.err.println("************isCircular************");
        insert.print();
        // Making linked list circular
      //  insert.head.next.next.next.next = insert.head;
        IsCircular isCircular = new IsCircular(insert.head, insert.tail, insert.size);
        boolean isCircularNode = isCircular.isCircularNode();
        System.err.println("isCircular " + isCircularNode);


    }
}
