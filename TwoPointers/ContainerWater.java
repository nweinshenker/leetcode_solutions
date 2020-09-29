package TwoPointers;

public class ContainerWater {
    public int maxArea(int[] height) {
        int ans = 0;
        int maxHeight = 0;
        int i = 0, j = height.length - 1;
        
        while (i < j) {
            maxHeight = Math.max(maxHeight, Math.max(height[i], height[j]));
            if (height[i] == maxHeight) {
                ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
                j--;
            }
            else if (height[j] == maxHeight) {
                ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
                i++;
            }
        }
        
        return ans;
    } 
}
