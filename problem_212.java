class Solution {
	public List<String> findWords(char[][] board, String[] words)  {
		
		Set<String> wordsOnBoard = new HashSet<>();
		
		for (String word : words) {
			char firstCharacter = word.charAt(0);

			int rows = board.length;
			int cols = board[0].length;

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if(board[i][j]==firstCharacter) {

						if(exist(board, word,i,j,0)) wordsOnBoard.add(word) ;
					}
				}
			}
		}
		
		return new ArrayList<>(wordsOnBoard);
	}

	public boolean exist(char[][] board, String word,int i ,int j,int word_index) {
 
        if(i>=board.length||i<0||j<0||j>=board[0].length) return false;
        
        char currentCharacter = word.charAt(word_index);

		if(board[i][j]!=currentCharacter)  return false;
        
        if(word_index==word.length()-1) return true; 


		char temp = board[i][j];

		board[i][j] = '#'; 

	    boolean res = exist(board, word,i+1,j,word_index+1)||exist(board, word,i-1,j,word_index+1)||exist(board, word,i,j-1,word_index+1)||exist(board, word,i,j+1,word_index+1);

		board[i][j] = temp; 

		return res;
	}
}
