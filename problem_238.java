class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    		int product = 1;
    		int ZeroesCount = 0;
            
    		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) { 
                ZeroesCount++;
				continue;
			}
    			product*=nums[i];   
		} 
    		if(ZeroesCount>1) product = 0; 
            
    		if(ZeroesCount>0) {
    			for (int i = 0; i < nums.length; i++) {
    				if(nums[i]!=0) nums[i] = 0;
    				else nums[i] = product;
    			}
    		}
    		else {
    			for (int i = 0; i < nums.length; i++) nums[i]=product/nums[i];
    		}
    		
    		return nums;
    }
}
