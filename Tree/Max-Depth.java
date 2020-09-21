import TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return calc(root, 0);
    }
    
    private int calc(TreeNode root,int depth){
        if(root == null) return 0;
        depth++;
        if(root.left == null && root.right == null) return depth;
        return Math.max(calc(root.left, depth), calc(root.right, depth));
    }

    public int maxDepth2(TreeNode root) {}
    private int calc(TreeNode root,int depth){
        if(root == null) return 0;
        depth++;
        if(root.left == null && root.right == null) return depth;
        return Math.max(calc(root.left, depth), calc(root.right, depth));
    }
}