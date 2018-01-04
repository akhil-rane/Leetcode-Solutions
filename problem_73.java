class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean fc = false;
        boolean fr = false;
        
        
        int rowlen= matrix.length;
        int collen= matrix[0].length;
        
        for(int i=0; i< rowlen;i++){
            for(int j=0; j< collen;j++){
                
                if(matrix[i][j]==0){
                    if(i==0) fr = true;
                    if(j==0) fc = true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }  
            }   
        }
        
        for(int i=1; i< rowlen;i++){
            
            if(matrix[i][0]==0){
                for(int j=1; j< collen;j++) matrix[i][j] = 0;   
            }
        }  
        
        for(int j=1; j<collen;j++){
            
            if(matrix[0][j]==0){
                for(int i=1; i< rowlen;i++) matrix[i][j] = 0;  
            }
        }
        
        if(fr){
            for(int j=0; j< collen;j++) matrix[0][j] = 0;   
        }
        
        if(fc){
            for(int i=0; i< rowlen;i++) matrix[i][0] = 0;   
        }
    }
}
