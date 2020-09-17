package June.Array;

import java.util.ArrayList;
import java.util.List;

public class Create_Target_Array {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> insertion = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            int idx = index[i];
            int num = nums[i];
            insertion.add(idx, num);
        }

        int[] arr = new int[insertion.size()];
        // ArrayList to Array Conversion
        for (int i = 0; i < insertion.size(); i++)
            arr[i] = insertion.get(i);

        return arr;
    } 
}