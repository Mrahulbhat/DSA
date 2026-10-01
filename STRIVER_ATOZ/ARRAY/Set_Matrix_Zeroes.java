
//BRUTE FORCE METHOD WORST METHOD

// in this method we will iterate through each index in the matrix, if its equal to 0, we will entire row and column as -1 
// TC = O( m * n + ( m + n ) )
// Later replace all -1 with 0 , again TC = O (m * n);

class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setRow(matrix,i); // O(n)
                    setColumn(matrix,j); // O(m)
                }  
            }
        }
        //so total TC = O( m * n + ( m + n ) )

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==Integer.MIN_VALUE){
                    matrix[i][j]=0;
                }
            }
        }
        // TC = O(m*n).  ===> TOTAL TC = O( m * n + ( m + n ) ) + O(m*n) => O( m * n + ( m + n ) ). 
        // why O(m*n) is ignored? if a>>>>>b we can say a+b=a;
    }
    public void setRow(int[][] matrix, int i){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public void setColumn(int[][] matrix, int j){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=Integer.MIN_VALUE;
            }
        }
    }
}

// =========================================================================================================================================================================================

// BETTER METHOD 
// In this method we will create a row[] and a column[]. We will iterate through each index. If value = 0, we will set row[index] and column[index] as 1 (marked)
// Later we will check whichever row is marked, we will update entire row/column with 0.

class Solution2 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row [] = new int[m];
        int col [] = new int[n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 ||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}