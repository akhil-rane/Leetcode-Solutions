class Solution {
   public void solve(char[][] board) {
        
    		int rows = board.length;
            
            if(rows==0) return;
        
    		int cols = board[0].length;
    	
    		for (int i = 0; i < rows; i++) {
    			for (int j = 0; j < cols; j++) {
				if(i==0||j==0||i==rows-1||j==cols-1) solve (board,i,j);  
				
			}
		}
    		
    		for (int i = 0; i < rows; i++) {
    			for (int j = 0; j < cols; j++) {
				if(board[i][j] == '*') board[i][j] = 'O';
				else board[i][j] = 'X';
			}
		} 
    		
    }
    
    public void solve (char[][] board,int i, int j) {
    	
        if(i>=board.length||i<0||j<0||j>=board[0].length) return ;        
        if(board[i][j]=='X'||board[i][j]=='*') return;
    
         board[i][j] = '*';
    		
    	solve (board,i+1,j);
        solve (board,i,j+1);
        solve (board,i-1,j);
        solve (board,i,j-1);
    }
}
