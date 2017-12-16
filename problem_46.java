class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
    		return permute(nums,0);
    }
    
    public List<List<Integer>> permute(int[] nums, int pivot) {
        
        List<List<Integer>> permutations = new ArrayList<>();
        
        if(pivot==nums.length-1){
            
            List<Integer> permutation = new ArrayList<>();
            
            for (int i = 0; i < nums.length; i++) permutation.add(nums[i]);
            
            permutations.add(permutation);
                
            return permutations;
            
        } 
    
        
        for (int i = pivot; i < nums.length; i++) {
			
        		int[] numsClone = nums.clone();
        		
        		int temp = numsClone[i];
        		numsClone[i] = numsClone[pivot];  
        		numsClone[pivot] = temp;
        		
        		permutations.addAll(permute(numsClone,pivot+1));
		}
        
        return permutations;
    }
}
