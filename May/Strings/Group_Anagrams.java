package May.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public List<List<String>> groupAnagram(String [] strs) {
        if (strs.length == 0)
            return new ArrayList();
        HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();

        for (String str: strs) {
            char [] array = str.toCharArray();
            Arrays.sort(array);
            String key = array.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
        
    } 
}