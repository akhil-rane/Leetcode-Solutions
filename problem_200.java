class Solution {
    public int numIslands(char[][] grid) {
        
        int rows = grid.length;
        
        if(rows==0) return 0;
        
        int cols = grid[0].length;
        
        int count = 0;
        
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(grid[i][j]=='1'){
                    mark(grid,i,j);
                    count++;
                }
                
            }
        }
        
        return count;
            
    }
    
    public void mark(char[][] grid,int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||grid[i][j]=='x') return; 
        
        grid[i][j]='x';
        
        mark(grid,i+1,j);
        mark(grid,i,j+1);
        mark(grid,i-1,j);
        mark(grid,i,j-1);
        
    }
}
