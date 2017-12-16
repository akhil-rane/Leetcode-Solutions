class Solution {
	public void sortColors(int[] nums) {

		int i = 0;
		int redindex = 0;
		int blueindex = nums.length-1;
        int temp;
         
		while(i<nums.length&&i<=blueindex) {

			if(redindex<=blueindex){
				if(nums[i] == 0) {
					temp = nums[redindex];
					nums[redindex] = nums[i];
					nums[i] = temp;
					redindex++;
					i++;
				}
				else if(nums[i] == 2) {
					temp = nums[blueindex];
					nums[blueindex] = nums[i];
					nums[i] = temp;
					blueindex--;
				}
                else i++;
			}
		}
	}
}
