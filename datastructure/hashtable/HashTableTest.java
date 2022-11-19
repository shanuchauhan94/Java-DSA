package datastructure.hashtable;

import java.util.Arrays;

public class HashTableTest {

    public static void main(String[] args) {
        HashTableC hashTableC = new HashTableC(2);
      //  System.err.println(hashTableC);
        int hashcode = hashTableC._hash("grapes");
        System.out.println("hashcode grapes -> " + hashcode);
        System.out.println("hashcode apples -> " + hashcode);
        int[] set = hashTableC.set("grapes", 1000);
        int[] set2 = hashTableC.set("apples", 500);
        System.err.println(hashTableC);
        int get = hashTableC.get("grapes");
        System.err.println("get -> "+get);
    }
}

