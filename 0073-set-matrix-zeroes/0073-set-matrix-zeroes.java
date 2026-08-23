class Solution {
    public void setZeroes(int[][] matrix) {
       int  row = matrix.length ;
       int col = matrix[0].length ;

       boolean[] rowzero = new boolean[row];
       boolean[] colzero = new boolean[col];

       for(int i = 0 ; i < row ; i++){
        for(int j =0 ; j<col ; j++){
            if(matrix[i][j] == 0 ){
                rowzero[i]= true ;
                colzero[j] = true ;
            }
        }
       }
        for(int i = 0 ; i < row ; i++){
        for(int j =0 ; j<col ; j++){
            if(rowzero[i]  || colzero[j] ){
                matrix[i][j] =0 ;
            }
        }
       }
       System.out.println(Arrays.deepToString(matrix)) ;
    }
}