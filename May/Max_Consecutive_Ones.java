package May;

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int curr = nums[0];
        int freq = 0;
        for (int x : nums) {
            if (x == 1) {
                freq++;
            } else {
                max = Math.max(max, freq);
                freq = 0;
            }
        }

        max = Math.max(max, freq);

        return max;
    }
    
}