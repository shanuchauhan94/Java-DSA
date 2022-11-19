package sorting_stream;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {

    public static void main(String[] args) {
        // sort based on Key using TreeMap(sorted by default over key)
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "ram");
        map.put(6, "shyam");
        map.put(4, "aman");
        map.put(9, "value");

        map.forEach((k, v) -> System.err.println(" " + k + "  " + v));
        System.out.println(" ");
        // sort based on Value using Comparator
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(s -> System.err.print(" "+s.getValue()));
    }
}
