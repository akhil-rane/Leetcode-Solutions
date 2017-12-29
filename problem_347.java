class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        	
    		Map<Integer,Integer> map = new HashMap<>(); 
    	
    		for (int i = 0; i < nums.length; i++) {
    			
    			map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
		}
    		
    		
    	    List<Integer>[] bucket = new ArrayList[nums.length+1];

        for (int key : map.keySet()) {
    			int value =  map.get(key);
    			if(bucket[value]==null) bucket[value] = new ArrayList<>();
                bucket[value].add(key);
		}
    		
    		List<Integer> result = new ArrayList<>();
        
            
    		
    		for (int i = bucket.length-1; i > 0; i--) {
				
                if(bucket[i]==null) continue;
                
    			List<Integer> currentBucket = bucket[i];
                                
    			for (Integer integer : currentBucket) {
		            result.add(integer);
    				if(--k==0) return result;
    			}
	    }
    		
    		return result;   		
    }
}
