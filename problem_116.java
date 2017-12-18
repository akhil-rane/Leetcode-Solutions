class Solution {
    public void connect(TreeLinkNode root) {
        
        if(root==null) return;
        
		Queue<TreeLinkNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		int levelSize = 0;
		
		while(!queue.isEmpty()) {
		
			levelSize = queue.size();
            
            Queue<TreeLinkNode> queue1 = new LinkedList<>();
					
			for (int i = 0; i < levelSize; i++) {
                
				TreeLinkNode currentNode = queue.poll();
                
                TreeLinkNode nextNode = queue.peek();
                
                currentNode.next = nextNode;
                
				if(currentNode.left!=null) {
                    queue1.add(currentNode.left);
				    queue1.add(currentNode.right);
                }
				
			}
            
            queue = queue1;
		}
    }
}
