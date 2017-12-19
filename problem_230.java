class Solution {
    public int kthSmallest(TreeNode root, int k) {
    		Stack<TreeNode> stack = new Stack<>();
    		
    		if(root==null) return 0; 
    	
            TreeNode current = root;
    		
            int i = 0;
            
    		while(current!=null||!stack.isEmpty()) {
    			if(current!=null){
                    stack.push(current);
                    current = current.left;
                    
                } 
    			else {
    				current = stack.pop();
                    if(i==k-1) return current.val;
                    i++;
    				current = current.right;
    			}                
    		}
    		return 0;     
    }
}
