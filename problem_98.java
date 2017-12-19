class Solution {
    public boolean isValidBST(TreeNode root) {
        
        if(root==null) return true;
        
        return  isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean isValidBST(TreeNode root,long lower, long upper) {
        
        if(root==null) return true;
        else if (root.val<=lower||root.val>=upper) return false;
        else return isValidBST(root.left,lower,root.val)&&isValidBST(root.right,root.val,upper);
        
    }
}
