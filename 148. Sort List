class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head= head.next;
        }
        Collections.sort(list);
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        for(int i=0;i<list.size();i++){
            ListNode t = new ListNode(list.get(i));
            current.next = t;
            current=current.next;
        }
        return temp.next;

    }
}
