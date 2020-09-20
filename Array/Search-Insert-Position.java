class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for (i = nums.length -1; i >= 0; i--) {
            if (nums[i] == target) return i;
            if (nums[i] < target) break;
        }
        return i + 1;
    }
}