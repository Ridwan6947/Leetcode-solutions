class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow.next = prev;
        fast = head;

        while(slow!=null&&slow.next!=null){
            ListNode temp=fast.next;
            fast.next=slow.next;
            slow.next=slow.next.next;
            fast.next.next=temp;
            fast=temp;
            if(fast==slow)break;
        }
    }
}
