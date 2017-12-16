cl`ass Solution {
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> spiralOrder = new ArrayList<>();

		if(matrix.length==0) return spiralOrder;

		int iLower = 1;
		int iUpper = matrix.length-1;
		int jLower = 0;
		int jUpper = matrix[0].length-1;

		int numOfElements = matrix.length*matrix[0].length;

		int flag = 1;

		int i = 0;
		int j = 0;

		while(spiralOrder.size() < numOfElements) {

			spiralOrder.add(matrix[i][j]);
			
			if(flag==1) {
				if(j==jUpper) {
					flag = 2;
					jUpper--;
					i++;
				}
				else j++;
			}
			else if(flag==2) {

				if(i==iUpper) {
					flag = 3;
					iUpper--;
					j--;
				}
				else i++;
			}
			else if(flag==3) {

				if(j==jLower) {
					flag = 4;
					jLower++;
					i--;
				}
				else j--;
			}
			else{

				if(i==iLower) {
					flag = 1;
					iLower++;
					j++;
				}
				else i--;
			}

		}

		return spiralOrder;
	}
}
