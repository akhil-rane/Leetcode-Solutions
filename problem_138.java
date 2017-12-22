class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        if(head==null) return head;
        
    	RandomListNode temp = head;
        
        RandomListNode head1 = new RandomListNode(head.label);
        
        temp=temp.next;
        
        RandomListNode current = head1;
        
        Map<Integer,RandomListNode> map = new HashMap<>();
        
        map.put(current.label,current);
        
        while(temp!=null) {
                RandomListNode node = new RandomListNode(temp.label);
                map.put(node.label,node);
                current.next=node;
                current = node;
                temp=temp.next;
        }
        
        temp = head;
        
        current =head1;
        
        while (temp!=null){
            
            if(temp.random!=null)current.random = map.get(temp.random.label);
            
            current = current.next;
            temp = temp.next;
        }
        
        return head1;
    }
}
