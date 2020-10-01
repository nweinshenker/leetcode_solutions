package Array;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<Character, Integer>();
        HashMap<Character, Integer> idxMap = new HashMap<Character,Integer>();

        int i = 0;
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            idxMap.put(c, i++);
        }

        for (Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return idxMap.get(entry.getKey());
            }
        }
        
        return -1;
        
    }
}