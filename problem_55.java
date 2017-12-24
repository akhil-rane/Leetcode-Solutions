class Solution {
	public boolean canJump(int[] nums) {
		List<Integer> indexOfZeroList = new ArrayList<>();
		
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) indexOfZeroList.add(i);
		}
		
        if(nums.length==1||indexOfZeroList.size()==0) return true;
				
		outer:
		for (Integer zeroIndex : indexOfZeroList) {
			
            if(zeroIndex == nums.length-1) break;
			
            for (int i = 0; i < zeroIndex; i++) {
				if(i+nums[i]>zeroIndex) continue outer;
			}
			
			return false;
		}
		
		return true;
	}

}
