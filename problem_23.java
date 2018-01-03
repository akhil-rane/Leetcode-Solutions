class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        Queue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            public int compare(ListNode l1,ListNode l2){
                return l1.val - l2.val;
            }
        });
        
        boolean flag = true;
        ListNode head = null;
        ListNode current = null;
        
        while(flag){
        
            flag =false;
            
            for(int i = 0;i<lists.length;i++ ){
                if(lists[i]!=null){
                    queue.add(lists[i]);
                    lists[i]=lists[i].next;
                    flag = true;
                }
            }
            
            if(current==null){
                current = queue.poll();
                head = current;
            } 
            else{
                ListNode temp = queue.poll();
                current.next=temp;
                current = temp;
            }
        }
        
        
        
        while(!queue.isEmpty()){
           ListNode temp = queue.poll();
           current.next=temp;
           current = temp;            
        }
        
        //Gives memory limit exceeded error because of circular linked list
        if(current!=null) current.next=null;
        
        return head;
        
    }
}
