package May;

public class Searchh_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        TreeNode node = helper(root, val);
        return node;
    }

    static TreeNode helper(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        if (val < node.val) {
            return helper(node.left, val);
        }
        return helper(node.right, val);
    }
    
    public TreeNode secondSearchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}