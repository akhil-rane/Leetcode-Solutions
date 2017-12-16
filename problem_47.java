class Solution {
	public void rotate(int[][] matrix) {

		for (int i = 0; i < matrix.length-i; i++) {
			for (int j = i; j < matrix.length-i-1; j++) {
				int temp1 = matrix[j][matrix.length-1-i];
				matrix[j][matrix.length-1-i]=matrix[i][j];

				int temp2 = matrix[matrix.length-1-i][matrix.length-1-j];
				matrix[matrix.length-1-i][matrix.length-1-j] = temp1;

				int temp3 = matrix[matrix.length-1-j][i]; 
				matrix[matrix.length-1-j][i] = temp2;
				
				matrix[i][j] = temp3;
                
			}
		}
	}
}
