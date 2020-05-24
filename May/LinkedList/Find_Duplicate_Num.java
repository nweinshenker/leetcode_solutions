package May.LinkedList;

public class Find_Duplicate_Num {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        while (true) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare)
                break;
        }
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) // checks if there is a cycle
        {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    } 
}