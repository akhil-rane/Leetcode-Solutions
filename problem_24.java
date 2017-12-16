class Solution {
	public ListNode swapPairs(ListNode head) {

		if(head==null) return null;
        if(head.next==null) return head;

		ListNode current = head;
		ListNode next = head.next;
		ListNode previous = null; 
		ListNode temp ;
		ListNode newHead = next;
		

		while(next!=null) {
			if(previous!=null) previous.next=next;
			temp=next.next;
			next.next = current;
			current.next = temp;
            previous = current;
			current = temp;
			if(temp==null) break; 
			next = temp.next;
			
			
		}

		return newHead;

	}
}
