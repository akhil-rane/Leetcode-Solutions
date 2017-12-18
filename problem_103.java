class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>>  results = new ArrayList<>();
        
        if(root==null) return results;
        
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		int levelSize = 0;
        
        boolean leftToRight = true;
		
		while(!queue.isEmpty()) {
			
			List<Integer> result = new LinkedList<>();
		
			levelSize = queue.size();
            		
			for (int i = 0; i < levelSize; i++) {
				
				TreeNode currentNode = queue.poll();
				
				if(leftToRight) result.add(currentNode.val);
				else result.add(0,currentNode.val);
				
                if(currentNode.left!=null) queue.add(currentNode.left);
				if(currentNode.right!=null) queue.add(currentNode.right);
					
			}
			
            results.add(result);
            leftToRight = !leftToRight;
		}
		
		return results;
		
	}
}
