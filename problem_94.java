class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       
    		List<Integer> result = new ArrayList<>();
    		Stack<TreeNode> stack = new Stack<>();
    		
    		if(root==null) return result; 
    	
            TreeNode current = root;
    		
    		while(current!=null||!stack.isEmpty()) {
    			if(current!=null){
                    stack.push(current);
                    current = current.left;
                } 
    			else {
    				current = stack.pop();
    				result.add(current.val);
    				current = current.right;
    			}	
    		}
    		return result;
    }
}
