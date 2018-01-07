class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        
        List<Integer> list = sumNumbers(root,0);
        
        int sum = 0 ;
        
        for(Integer i : list) sum+=i;
        
        return sum;
        
    }
    
    public List<Integer> sumNumbers(TreeNode root,int num) {
        
        List<Integer> list = new ArrayList<>();
        
        if(root==null) {
            return list;
        }
        else if(root.left==null&&root.right==null) {
            list.add((num+root.val));
            return list;
        }
        
        list.addAll(sumNumbers(root.left,(num+root.val)*10));
        list.addAll(sumNumbers(root.right,(num+root.val)*10));
        
        
        return list;
    }
    
    
}
