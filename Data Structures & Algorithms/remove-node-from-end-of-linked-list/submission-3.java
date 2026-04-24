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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Approach 1: Two pass - O(n)
        // if(head == null) return head;
        // int length = 0;
        // ListNode curr = head;

        // while(curr != null)
        // {
        //     length++;
        //     curr = curr.next;
        // }

        // int removeIndex = length - n;
        // if (removeIndex == 0) {
        //     return head.next;
        // }

        // curr = head;
        // for(int i = 0; i < length - 1; i++)
        // {
        //     if((i+1) == removeIndex)
        //     {
        //         curr.next = curr.next.next;
        //         break;
        //     }
        //     curr = curr.next;
        // }
        // return head;

        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = head;

        while(n > 0)
        {
            second = second.next;
            n--;
        }

        while(second != null)
        {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }
}
