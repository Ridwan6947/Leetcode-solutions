class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;

        for(int i = 1 ; i < k ; i++){
            left = left.next;
        }

        ListNode current = left;
        while(current.next != null){
            current = current.next;
            right = right.next;
        }

        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
    }
}
