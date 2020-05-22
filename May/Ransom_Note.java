package May;

import java.util.*;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) {
                return false;
            }
            
            Map<Character,Integer> map = new HashMap<Character,Integer>();
            // Place all the elements into a mapping
            for (char c : magazine.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character,Integer> entry: map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
            
            char [] array = ransomNote.toCharArray();
            for (char c : array) {
                int countInMagazine = map.getOrDefault(c, 0);
                if (countInMagazine == 0) {
                    return false;
                }
                map.put(c, countInMagazine - 1);
            }
            
            return true;
            
    }
}