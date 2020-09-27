package Array;

public class MinSubArray {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;

        int minWindow = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            while (sum >= s) {
                minWindow = Math.min(minWindow, i + 1 - j);
                sum -= nums[j];
                j++;
            }
            i++;
        }
        
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}
