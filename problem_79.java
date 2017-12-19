class Solution {
	public boolean exist(char[][] board, String word) {
		char firstCharacter = word.charAt(0);

		int rows = board.length;
		int cols = board[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(board[i][j]==firstCharacter) {

					if(exist(board, word,i,j,0)) return true;
				}
			}
		}

		return false;
	}

	public boolean exist(char[][] board, String word,int i ,int j,int word_index) {
		
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        
        char currentCharacter = word.charAt(word_index);

		if(board[i][j]!=currentCharacter)  return false;
        
        if(word_index==word.length()-1) return true; 

		char temp = board[i][j];

		board[i][j] = '#'; 
		
		boolean result = exist(board, word,i+1,j,word_index+1)||exist(board, word,i-1,j,word_index+1)||exist(board, word,i,j-1,word_index+1)||exist(board, word,i,j+1,word_index+1);

		board[i][j] = temp; 

		return result;
	}
}
