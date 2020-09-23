package Array;

import java.util.Arrays;
import java.util.*;

public class MinimumAbsoluteDifferene {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) min = Math.abs(arr[i] - arr[i - 1]);
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                list.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
        }
        
        return list;
    }

}
