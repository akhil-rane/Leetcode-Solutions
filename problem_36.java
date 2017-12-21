class Solution {
    public boolean isValidSudoku(char[][] board) {

    		for (int i = 0; i < board.length; i+=3) {
			for (int j = 0; j < board.length; j+=3) {
				
				boolean[] present = new boolean[9];
				
				for (int k = i; k < i+3; k++) {
					for (int l = j; l < j+3; l++) {
						if(board[k][l]=='.') continue;
						if(present[board[k][l]-49]) return false;
						present[board[k][l]-49] = true;
					}
				}	
			}	
		}
        	

        	for (int i = 0; i < board.length; i++) {
        		boolean[] present = new boolean[9];
        		for (int j = 0; j < board.length; j++) { 
        			if(board[i][j]=='.') continue;
        			if(present[board[i][j]-49]) return false;
        			present[board[i][j]-49] = true;
    			}
        	}

        	for (int j = 0; j < board.length; j++) {
        		boolean[] present = new boolean[9];
        		for (int i = 0; i < board.length; i++) { 
        			if(board[i][j]=='.') continue;
        			if(present[board[i][j]-49]) return false;
        			present[board[i][j]-49] = true;
    			}
        	}
        	
        	return true;
    }
}
