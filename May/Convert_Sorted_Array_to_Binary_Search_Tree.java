package May;


public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode solution(int[] nums) {
        if (nums == null) {
            return null;
        }
        return balanced(nums, 0, nums.length);
    }

    public TreeNode balanced(int [] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return null;
        }

        int mid = (startIdx + endIdx) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = balanced(nums, startIdx, mid - 1);
        root.right = balanced(nums, mid + 1, endIdx);
        return root;
    }
}