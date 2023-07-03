class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode evenhead = even;
        ListNode oddhead = odd;
        int count = 1;
        ListNode curr = head;
        while(curr != null){
            if(count % 2 == 0){
                evenhead.next = curr;
                evenhead =evenhead.next; 
            }else{
                oddhead.next = curr;
                oddhead = oddhead.next;
            }
            curr = curr.next;
            count++;
        }
        evenhead.next = null;
        oddhead.next = even.next;
        return odd.next;
    }
}
