package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    List<Node> children;
    int val;

    Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    Node() {

    }

}

public class NaryTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.val);
                for (Node ni: node.children) {
                    queue.add(ni);
                }
            }
            list.add(level);
        }
        
        return list;
    } 
}
