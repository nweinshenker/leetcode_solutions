package June.Array;

import java.util.*;
public class Compress_String {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while ((2 * i + 1) < nums.length) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];

            while (freq != 0) {
                list.add(val);
                freq--;
            }

            i = i + 1;
        }

        int[] finals = new int[list.size()];
        i = 0;
        for (Integer ele : list) {
            finals[i++] = (int) ele;
        }

        return finals;
    } 
}