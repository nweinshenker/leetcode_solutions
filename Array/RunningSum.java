package Array;

class RunningSum {
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) return new int [] {};
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        
        return nums;
    }
}