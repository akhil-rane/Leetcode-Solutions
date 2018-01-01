class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       
        int size =triangle.size();
        
        int[][] storedMinTotals = new int [size][triangle.get(size-1).size()]; 
        
        boolean[][] isStored = new boolean [size][triangle.get(size-1).size()];
        
        return triangle.get(0).get(0)+minTotal(triangle,1,0,storedMinTotals,isStored);  
    }
    
    public int minTotal(List<List<Integer>> triangle,int row,int lastIndex,int[][] storedMinTotals, boolean[][] isStored){

        if(row==triangle.size()) return 0;
        else if(isStored[row][lastIndex]==true) return storedMinTotals[row][lastIndex];
        int minTotal=Math.min(triangle.get(row).get(lastIndex)+minTotal(triangle,row+1,lastIndex,storedMinTotals,isStored),triangle.get(row).get(lastIndex+1)+minTotal(triangle,row+1,lastIndex+1,storedMinTotals,isStored));
        
        storedMinTotals[row][lastIndex] = minTotal;
        isStored[row][lastIndex] = true;
        
        return minTotal;
    }
}
