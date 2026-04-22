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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Approach 1: Brute force - Time O((n+m)log(n+m)), Space O(n+m)
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode curr = list1;
        // while(curr != null)
        // {
        //     arr.add(curr.val);
        //     curr = curr.next;
        // }

        // curr = list2;
        // while(curr != null)
        // {
        //     arr.add(curr.val);
        //     curr = curr.next;
        // }
        // Collections.sort(arr);
        // if(arr.size() == 0)
        // {
        //     return list1;
        // }
        // ListNode mergedList = new ListNode(arr.get(0));
        // ListNode tail = mergedList;
        // for(int i = 1; i < arr.size(); i++)
        // {
        //     tail.next = new ListNode(arr.get(i));
        //     tail = tail.next;
        // }

        // return mergedList;

        //Approach 2: O(n+m)

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null)
        {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
}