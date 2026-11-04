class Solution {
    public  boolean searchMatrix(int[][] matrix, int target) {
        int sr =0;
        int er = matrix.length - 1 ;
        int row = 0 ;
        while(sr<er){
            int midr = sr + (er-sr)/2 ;
            
            if(matrix[midr][0] >  target){
                er = midr -1 ;
            }
            if(matrix[midr][matrix[midr].length -1] < target){
                sr = midr+ 1 ;
            }
            midr = sr + (er-sr)/2 ;
            if(matrix[midr][0] <= target && matrix[midr][matrix[midr].length -1] >= target){
                sr = midr ;
                er = midr ;
                row = midr ;
            }

        }
        int sc =0;
        int ec = matrix[row].length -1 ;
        while(sc<=ec){
            int midc =sc + (ec-sc)/ 2 ;
            if(matrix[row][midc] == target){
                return true ;
            }
            if(matrix[row][midc] < target){
                sc = midc + 1 ;
            }else{
                ec = midc -1 ;
            }
        }
        return false ;
    }
}