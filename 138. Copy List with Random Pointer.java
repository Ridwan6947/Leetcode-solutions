class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> list = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Node temp = new Node(curr.val);
            list.put(curr,temp);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            Node temp = list.get(curr);
            temp.next = list.get(curr.next);
            temp.random = list.get(curr.random);
            curr = curr.next;
        }
        return list.get(head);
    }
}
