package May.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode (int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Convert_Binary_Number {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        ListNode node = new ListNode(0);
        node.next = head;

        int i = 0;
        while (node != null) {
            sb.insert(i++, String.valueOf(node.val));
            node = node.next;
        }

        int x = Integer.parseInt(sb.toString(), 2);
        ;
        return x;
    } 
}