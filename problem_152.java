class Solution {
    public int maxProduct(int[] nums) {
    		if(nums.length==0) return 0;
    		
    		int max = nums[0];
    		int min = nums[0];
    		int result = nums[0];
    		
    		for (int i = 1; i < nums.length; i++) {
			
    			int temp = max;
                
                max = Math.max(Math.max(min*nums[i],max*nums[i]),nums[i]);
                min = Math.min(Math.min(min*nums[i],temp*nums[i]),nums[i]);
    	
    			result = Math.max(max,result);
		}
    		
    		return result;
    		
    }
}
