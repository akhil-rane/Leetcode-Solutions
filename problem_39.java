class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> finalList = new ArrayList<>();
        
        for(int i =0 ; i<candidates.length;i++){
            
            List<Integer> list = new ArrayList<>();
            
            list.add(candidates[i]);
            
            combinationSum(finalList,candidates,target-candidates[i],list,i);
        }
         
        return finalList;
    }
            
    public void combinationSum(List<List<Integer>> finalList,int[] candidates, int target, List<Integer> list,int start){
        
    
        if(target==0) {
            finalList.add(list);
        }
        else if(target>0){
        for(int i = start ; i<candidates.length;i++){
            
            List<Integer> list1 = new ArrayList<>(list);
                        
            list1.add(candidates[i]);
            
            combinationSum(finalList,candidates,target-candidates[i],list1,i);
        }
        }
    }
}
  
