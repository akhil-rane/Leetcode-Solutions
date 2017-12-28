class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int start = 0;
      int fuelLeft = 0;
      
      int total = 0;
      
      for (int i = 0; i < cost.length; i++) {
        
    	if(fuelLeft<0) {
           
  	  	   start = i;
  	  	   fuelLeft = 0;
  	  	}
        
        fuelLeft += gas[i] - cost[i];  
        total+=fuelLeft;
          
      }
         
      return total<0 ? -1 : start ;
    }
}
