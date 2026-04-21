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
        
        //Approach 1: Brute force - Time O(n) + Space O(n) 
        // ArrayList<Integer> arr = new ArrayList<>();

        // ListNode curr = head;
        // if(head == null || head.next == null) // Check if list is empty or has only one node
        // {
        //     return head;
        // }
        // while(curr != null)
        // {
        //     arr.add(curr.val);
        //     curr = curr.next;
        // }

        // ListNode newHead = new ListNode(arr.get(arr.size() - 1));
        // ListNode tail = newHead;

        // for(int i = arr.size() - 2; i >= 0; i--)
        // {
        //     tail.next = new ListNode(arr.get(i));
        //     tail = tail.next; 
        // }
        // return newHead;

        //Approach 2: In place - Time O(n) + space O(1)

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
