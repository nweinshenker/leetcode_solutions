package January;

import java.util.Arrays;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;

        // Sort the two strings into array of characters
        char[] array = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array2);

        if (array.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                isAnagram = false;
                break;
            }
            isAnagram = true;
        }

        return isAnagram;

    }
    
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            System.out.println(idx);
            table[idx]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            table[idx]--;
            if (table[idx] < 0) {
                return false;
            }
        }

        return true;
    }
}