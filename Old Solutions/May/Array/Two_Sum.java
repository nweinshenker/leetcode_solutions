package May.Array;
import java.util.*;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            seen.add(complement);
            for (int j = i + 1; j < nums.length; j++) {
                if (seen.contains(nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int []{0, 0};
        
    }
}