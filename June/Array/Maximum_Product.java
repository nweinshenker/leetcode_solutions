package June.Array;

import java.util.Arrays;

public class Maximum_Product {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }

        Arrays.sort(nums);

        int maximum = nums[nums.length - 1];

        int product1 = maximum * nums[0] * nums[1];
        int product2 = maximum * nums[nums.length - 2] * nums[nums.length - 3];

        return (int) Math.max(product1, product2);

    } 
}