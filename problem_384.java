class Solution {
    
    private int[] original;
    
    private Random random;
    
    public Solution(int[] nums) {
        original = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    
        int[] shuffled = original.clone();
        
        for(int k = 0; k< shuffled.length;k++ ){
            
            int i = random.nextInt(shuffled.length);
      
            int temp = shuffled[k];
            shuffled[k] = shuffled[i];
            shuffled[i] = temp;
            
        }
        
        return shuffled;
    }
}
