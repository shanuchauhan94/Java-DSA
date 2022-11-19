package datastructure.Array;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMaxRepeatingChar {

    private Character find2ndMaxRepeatingChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Character key = itr.next().getKey();
            Integer value = itr.next().getValue();
            if (value > firstMax) {     // firstMax = 0 , secondMax = 0
                secondMax = firstMax;  // before update firstMax , store firstMax value into secondMax
                firstMax = value;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
            }
            if (value == secondMax) {
                return key;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        SecondMaxRepeatingChar repeatingChar = new SecondMaxRepeatingChar();
        Character key = repeatingChar.find2ndMaxRepeatingChar("potato");
        System.err.println(key);
    }
}
