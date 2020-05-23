package May.DepthFirstSearch;

import java.util.*;

public class Two_Sum_IV {

    public static boolean solution(TreeNode node, int k) {
        Set<Integer> set = new HashSet<>();
        return helper(node, k, set);
    }

    static boolean helper (TreeNode node, int target, Set<Integer> set) {
        if (node == null) { return false;}
        if (set.contains(node.val - target)) {
            return true;
        }
        set.add(node.val);
        return helper(node.left, target, set) || helper(node.right, target, set);
    }

    public static void main(String[] args) {
        // Define a Tree
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(6);

        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);

        node.right = new TreeNode(6);
        node.right.right = new TreeNode(7);
        node.right.left = null;

        int target = 9;
        System.out.println(solution(node, target));
    }
    
}