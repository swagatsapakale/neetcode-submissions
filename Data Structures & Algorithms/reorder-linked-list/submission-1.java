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
    public void reorderList(ListNode head) {
        //Approach 1: Brute force - Time O(n) + Space O(n)
        // if (head == null) {
        //     return;
        // }
        // ArrayList<Integer> arr = new ArrayList<>();

        // ListNode curr = head;
        // while(curr != null)
        // {
        //     arr.add(curr.val);
        //     curr = curr.next;
        // }

        // int left = 0;
        // int right = arr.size() - 1;
        // ArrayList<Integer> reorderedArr = new ArrayList<>(); 
        // while(left <= right)
        // {
        //     if(left != right)
        //     {
        //         reorderedArr.add(arr.get(left));
        //         reorderedArr.add(arr.get(right));
        //     } else {
        //         reorderedArr.add(arr.get(left));
        //     }
        //     left++;
        //     right--;            
        // }

        // ListNode tail = head;
        // for(int i = 1; i < reorderedArr.size(); i++)
        // {
        //     tail.next = new ListNode(reorderedArr.get(i));
        //     tail = tail.next;
        // }

        //Approach 2: Two pointer - slow and fast pointers

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        } 

        ListNode curr = slow.next;
        ListNode prev = slow.next = null;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head;
        curr = prev;
        while(curr != null)
        {
            ListNode temp1 = first.next;
            ListNode temp2 = curr.next;

            first.next = curr;
            curr.next = temp1;

            first = temp1;
            curr = temp2;
        }
    }
}
