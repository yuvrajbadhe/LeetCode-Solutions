class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length ;
        int count = 0;
        int[] arr = new int[r *r];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j< r ; j++){
                arr[count] = matrix[i][j] ;
                count++ ;
            }
        }
        Arrays.sort(arr);
        return arr[k-1] ;
    }
}