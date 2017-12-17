class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>>  results = new ArrayList<>();
        
        if(root==null) return results;
        
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		int levelSize = 0;
		
		while(!queue.isEmpty()) {
			
			List<Integer> result = new ArrayList<>();
		
			levelSize = queue.size();
					
			for (int i = 0; i < levelSize; i++) {
				
				TreeNode currentNode = queue.poll();
				
				result.add(currentNode.val);
				
				if(currentNode.left!=null) queue.add(currentNode.left);
				if(currentNode.right!=null) queue.add(currentNode.right);
				
			}
			
			results.add(result);
			
		}
		
		return results;
		
	}
}
