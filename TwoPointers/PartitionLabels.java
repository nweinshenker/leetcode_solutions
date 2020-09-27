package TwoPointers;

import java.util.ArrayList;
import java.util.List;

class PartionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<Integer>();
        int [] lastChar = new int [26];
        for (int i = 0; i < S.length(); i++) {
            lastChar[S.charAt(i) - 'a'] = i;
        }
        
        int anchor = 0, j = 0;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(lastChar[S.charAt(i) - 'a'], j);
            if (i == j) {
                result.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        
        return result;
    }
}