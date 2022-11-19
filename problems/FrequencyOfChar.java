package problems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {
        String s = "aafgshjj";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), ++count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        map.forEach((key, value) -> System.err.println(key + " -> " + value));
    }
}
