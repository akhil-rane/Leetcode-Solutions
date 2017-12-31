class Solution {
	public void nextPermutation(int[] nums) {
		int start = 0; 
		boolean notPossible = true;  

		for(int i = nums.length-2; i>=0 ;i--){
			if(nums[i]<nums[i+1]){
				start = i;
				notPossible = false;
				break;
			}
		}

		int max= Integer.MAX_VALUE;
		int swapIndex = start;

		for(int i = start+1; i<nums.length ;i++){
			if(nums[start]<nums[i]&&nums[i]<=max){
				max = nums[i];
				swapIndex = i;  
			}
		}

		int temp = nums[start];
		nums[start] = nums[swapIndex];
		nums[swapIndex] = temp;  

		int j=nums.length-1;
		int pivot = ((nums.length-start-1)/2)+start;  

		if(notPossible) start = -1 ; 

		for(int i = start+1; i<=pivot  ;i++){
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;  
			j--;

		}
	}
}
