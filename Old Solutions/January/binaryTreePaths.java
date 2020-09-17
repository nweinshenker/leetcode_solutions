package January;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val) {this.val = val;}
}

class Solution {
    List<String> res = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return res;
        }
        String s = "";
        helper(root, s);
        return res;
    }

    public void helper(TreeNode root, String s) {
        if (s.length() > 0) {
            s += "->";
        }
        s += String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            // add
            res.add(s);
        }
        if (root.left != null) {
            helper(root.left, s);
        }
        if (root.right != null) {
            helper(root.right, s);
        }
    }

}