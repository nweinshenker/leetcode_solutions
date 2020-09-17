package May.TwoPointers;
import java.util.Arrays;

public class Intersection_Two_Array_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return new int[] {};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int j = 0;
        int i = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
    
}