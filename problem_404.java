class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
    		
    		if(root==null) return 0;
    		
    		return sumOfLeftLeaves(root.left,true) + sumOfLeftLeaves(root.right, false);
    		
    }
    
    public int sumOfLeftLeaves(TreeNode root,Boolean left) {
    		if(root==null) return 0;
    		else if(root.left==null&&root.right==null&&left==true) return root.val;
            else if (root.left==null&&root.right==null&&left==false) return 0; 
    		else return sumOfLeftLeaves(root.left,true) + sumOfLeftLeaves(root.right, false);
    }
}
