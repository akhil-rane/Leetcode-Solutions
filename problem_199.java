class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        return buildList(root,list,0);
        
    }
    
    public List<Integer> buildList(TreeNode root,List<Integer> list,int depth){
        
        if(root==null) return list;
        
        if(depth>=list.size()) list.add(root.val);
        else list.set(depth,root.val);
        
        List<Integer> left = buildList(root.left,list,depth+1);
        
        return buildList(root.right,left,depth+1);
    }
}
