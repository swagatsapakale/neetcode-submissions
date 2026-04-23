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
        if (head == null) {
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = arr.size() - 1;
        ArrayList<Integer> reorderedArr = new ArrayList<>(); 
        while(left <= right)
        {
            if(left != right)
            {
                reorderedArr.add(arr.get(left));
                reorderedArr.add(arr.get(right));
            } else {
                reorderedArr.add(arr.get(left));
            }
            left++;
            right--;            
        }

        ListNode tail = head;
        for(int i = 1; i < reorderedArr.size(); i++)
        {
            tail.next = new ListNode(reorderedArr.get(i));
            tail = tail.next;
        }
    }
}
