/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        //Approach 1: HashSet O(n)
        HashSet<ListNode> hSet = new HashSet<>();
        ListNode curr = head;

        while(curr != null)
        {
            if(hSet.contains(curr))
            {
                return true;
            } 
            hSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
