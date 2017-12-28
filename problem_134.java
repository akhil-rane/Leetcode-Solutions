class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int start = 0;
      int fuelLeft = 0;
      
      int totalGas = 0;
      int totalCost = 0;
      
      for (int i = 0; i < cost.length; i++) totalCost+=cost[i];
      for (int i = 0; i < gas.length; i++)  totalGas+=gas[i];
      
      if(totalGas<totalCost) return -1;
      
      for (int i = 0; i < cost.length; i++) {
    	  	
    	if(fuelLeft<0) {
  	  	   start = i;
  	  	   fuelLeft = 0;
  	  	}
    	  	
        fuelLeft += gas[i] - cost[i];
    	  	
    	if((i+1)%cost.length==start) return start;
    	else if(i==cost.length-1) i = -1;
      }
         
      return -1;
    }
}
