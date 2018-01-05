class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
        
        ListNode temp = head;
        
        int lengthOfList = 0;
        
        while(temp!=null){
            temp=temp.next;
            lengthOfList++;
        }
        
        int requiredRotation = k%lengthOfList;
        
        temp=head;
        
        int i = 0; 
        
        while(i<requiredRotation){
            temp=temp.next;
            i++;
        }
        
        ListNode breakpoint = head;
        
        while(temp.next!=null){
            temp=temp.next;
            breakpoint = breakpoint.next;
        }
        
        temp.next=head;
        head = breakpoint.next;
        breakpoint.next = null;
        
        return head;
    }
}
