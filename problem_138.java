class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        if(head==null) return head;
        
    	RandomListNode originalListPointer = head;
        
        RandomListNode headOfNewList = new RandomListNode(head.label);
        
        RandomListNode copyListPointer = headOfNewList;
        
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        
        map.put(originalListPointer,copyListPointer);
        
        originalListPointer=originalListPointer.next;
        
        while(originalListPointer!=null) {
                RandomListNode node = new RandomListNode(originalListPointer.label);
                map.put(originalListPointer,node);
                copyListPointer.next=node;
                copyListPointer = node;
                originalListPointer=originalListPointer.next;
        }
        
        originalListPointer = head;
        
        copyListPointer = headOfNewList;
        
        while (originalListPointer!=null){
            
            if(originalListPointer.random!=null) copyListPointer.random = map.get(originalListPointer.random);
            
            copyListPointer = copyListPointer.next;
            originalListPointer = originalListPointer.next;
        }
        
        return headOfNewList;
    }
}
