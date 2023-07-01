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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        if(size == 1){
            return null;
        }
        int mid = size/2;
        int i = 1;
        ListNode prev = head;
        while(i < mid){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
    }
}
