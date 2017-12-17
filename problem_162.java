class Solution {
    public int findPeakElement(int[] nums) {
    		return find(0,nums.length-1,nums);
    }
    
    public int find(int l,int r,int[] nums) {
    		
    		if(l>=r) return l;
    		
    		int mid = (l+r)/2;
            
    		if(nums[mid]>nums[mid+1]) return find(l,mid,nums);
    		
    		return find(mid+1,r,nums);
    }
    
    
}

