class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    		ListNode first = head;
    		ListNode second = head;
            ListNode third = new ListNode(0);
            third.next = second;
            
    		for (int i = 0; i < n; i++) {
    			first =first.next;
		    }
            
    		
    		while (first!=null) {
    			first = first.next;
    			second = second.next;
                third = third.next;
    		}
        
            if(second == head){
                head = second.next;
                return head;
            }
            
            while (third.next!=second){
                third = third.next;
            }
    		
            third.next = second.next;
          
    		return head;
    }
}
