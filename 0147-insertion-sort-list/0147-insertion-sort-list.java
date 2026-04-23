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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0); // start of sorted list
        ListNode curr = head;

        while(curr != null){

            ListNode prev = dummy;
            ListNode next = curr.next;

            // find correct position
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            // insert node
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }
}