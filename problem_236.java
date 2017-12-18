class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    		if(root==null) return null;
    		
    		TreeNode left = lowestCommonAncestor(root.left, p, q);
    		TreeNode right = lowestCommonAncestor(root.right, p, q);
    		
    		if(left!=null&&right!=null) return root;
    		else if(left!=null) {
    			if(left==p&&root==q) return q;
    			else if(left==q&&root==p) return p; 
    			else return left;
    		}
    		else if(right!=null) {
    			if(right==p&&root==q) return q;
    			else if(right==q&&root==p) return p; 
    			else return right;
    		}
    		else if(root==p||root==q) return root;
    		else return null;
    		
    }
}
