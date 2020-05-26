package May.Array;
import java.util.*;

public class Missing_Number {
    public int missingNumber(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            seen.add(i);
        }

        for (int num : nums) {
            seen.remove(num);
        }

        Iterator<Integer> it = seen.iterator();
        while (it.hasNext()) {
            return it.next();
        }

        return 0;
    }
}