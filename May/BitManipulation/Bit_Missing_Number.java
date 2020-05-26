package May.BitManipulation;

public class Bit_Missing_Number {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
    
}