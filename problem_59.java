ass Solution {
    public int[][] generateMatrix(int n) {
        
        List<Integer> spiralOrder = new ArrayList<>();

        int[][] matrix = new int[n][n];
        
		int iLower = 1;
		int iUpper = n-1;
		int jLower = 0;
		int jUpper = n-1;

		int numOfElements = n*n;
		
		int num = 1;

		int flag = 1;

		int i = 0;
		int j = 0;
		
		int k = 0;

		while(k < numOfElements) {

			matrix[i][j] = num;
			
			if(flag==1) {
				if(j==jUpper) {
					flag = 2;
					jUpper--;
					i++;
				}
				else{

					j++;
				}

			}
			else if(flag==2) {

				if(i==iUpper) {
					flag = 3;
					iUpper--;
					j--;
				}
				else{
					
					i++;
				}
			}
			else if(flag==3) {

				if(j==jLower) {
					flag = 4;
					jLower++;
					i--;
				}
				else{
					j--;
				}
			}
			else{

				if(i==iLower) {
					flag = 1;
					iLower++;
					j++;
				}
				else{
					i--;
				}
			}
			num++;
			k++;

		}

		return matrix;
	
    }
}
