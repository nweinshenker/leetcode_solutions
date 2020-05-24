package May.DepthFirstSearch;

import May.DepthFirstSearch.*;

public class Sum_Of_Left_Leaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    public int helper(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return isLeft == true ? node.val : 0;
        }

        int total = 0;
        if (node.left != null) {
            total += helper(node.left, true);
        }
        if (node.right != null) {
            total += helper(node.right, false);
        }
        return total;
    }
}