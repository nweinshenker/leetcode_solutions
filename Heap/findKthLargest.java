package Heap;

import java.util.PriorityQueue;

public class findKthLargest {
    public int findkthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> o1 - o2);
        for (int n : nums) {
            if (pq.size() > k) {
                pq.remove();
            }
            pq.add(n);
        }
        
        while (pq.size() > k) {
            pq.poll();
        }
        
        return pq.poll();
    } 
}
