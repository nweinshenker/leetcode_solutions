package Array;

import java.util.HashMap;

public class AnagramMap {
    public int[] anagramMappings(int[] A, int[] B) {
        int [] mapping = new int [A.length];
        
        HashMap<Integer,Integer> mapB = new HashMap<Integer,Integer>();
        for (int i = 0; i < B.length; i++) {
            mapB.put(B[i], i);
        }
        
        for (int i = 0; i < A.length; i++) {
            if (mapB.containsKey(A[i])) {
               mapping[i] = mapB.get(A[i]); 
            }
        }
        
        return mapping;
    }
}
