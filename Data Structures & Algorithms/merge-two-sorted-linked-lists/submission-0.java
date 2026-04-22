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
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = list1;
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }

        curr = list2;
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(arr);
        if(arr.size() == 0)
        {
            return list1;
        }
        ListNode mergedList = new ListNode(arr.get(0));
        ListNode tail = mergedList;
        for(int i = 1; i < arr.size(); i++)
        {
            tail.next = new ListNode(arr.get(i));
            tail = tail.next;
        }

        return mergedList;
    }
}