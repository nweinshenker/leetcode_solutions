package June.HashMap;

import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int floor = (int) Math.floor(nums.length / 2);

        Map<Integer, Integer> maj = new HashMap<>();
        for (int num : nums) {
            maj.put(num, maj.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : maj.entrySet()) {
            if (entry.getValue() > floor) {
                return entry.getKey();
            }
        }

        return 0;
    } 
}