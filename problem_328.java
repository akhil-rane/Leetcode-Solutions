class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        
        ListNode evenStart = head.next;
        
        while(odd.next!=null&&even.next!=null){
            odd.next = even.next;
            odd = even.next;
            even.next= odd.next;
            even = odd.next;
        }
        
        odd.next = evenStart;
        
        return head;
    }
}
