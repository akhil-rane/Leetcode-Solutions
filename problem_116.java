class Solution {
	public void connect(TreeLinkNode root) {
		TreeLinkNode levelStart = root;

		while (levelStart!=null)
		{	
			
			TreeLinkNode currentNode = levelStart;
			
			levelStart = currentNode.left;
			
			while(currentNode!=null) {
				
				 if(currentNode.left!=null){ 
                     currentNode.left.next= currentNode.right;
				    if(currentNode.next!=null) currentNode.right.next = currentNode.next.left;
                 }
				 currentNode = currentNode.next;
			}
		}

	}
}
