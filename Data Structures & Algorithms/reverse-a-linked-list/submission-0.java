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
    public ListNode reverseList(ListNode head) {
        
        //Approach 1: Brute force - 
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;

        if(head == null)
        {
            return head;
        }
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }

        ListNode newHead = new ListNode(arr.get(arr.size() - 1));
        ListNode tail = newHead;

        if(arr.size() < 2)
        {
            return newHead;
        }
        for(int i = arr.size() - 2; i >= 0; i--)
        {
            tail.next = new ListNode(arr.get(i));
            tail = tail.next; 
        }

        return newHead;
    }
}
