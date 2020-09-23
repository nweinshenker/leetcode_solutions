package Array;

public class ValuesAtLeastLengthK {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int counter = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                while (i + 1 < nums.length && nums[i + 1] != 1) {
                    counter++;
                    i++;
                }
                if (i < nums.length - 1 && counter < k) {
                    return false;
                }
                counter = 0;
            }
            i++;
        }
        
        return true;

    } 
}
