package FailFastAndFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> empName = new ConcurrentHashMap<>();
        empName.put("key1", "New york");
        empName.put("key2", "LA");
        empName.put("key3", "Chicago");
        Iterator<String> iterator = empName.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(empName.get(iterator.next()));
            // adding an element to Map
            // exception will NOT be thrown on next call
            // of next() method.
            empName.put("key4", "Turkey");
        }
    }
}
