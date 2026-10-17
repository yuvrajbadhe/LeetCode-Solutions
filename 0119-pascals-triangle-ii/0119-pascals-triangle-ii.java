class Solution {
    public List<Integer> getRow(int rowIndex) {
      int[][] arr = new int[rowIndex +1][];

        for (int row = 0; row < rowIndex + 1; row++) {
            arr[row] = new int[row + 1];
            if(row < 2) {
                for (int col = 0; col <= row; col++) {
                    arr[row][col] = 1 ;
                }
            }
            if(row > 1) {

                for (int col = 0; col <= row; col++) {
                   if(col == 0 || col == row){
                       arr[row][col] = 1 ;
                   }else{
                       arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
                   }
                }
            }
        }
           List<List<Integer>> ans = new ArrayList<>() ;
        for(int row = 0 ; row < rowIndex + 1 ; row++){
        List<Integer> list = new ArrayList<>() ;
            for(int col = 0 ; col <= row ; col++){
                list.add(arr[row][col]);
            }
              ans.add(list);
        }
     
      
     return ans.get(rowIndex) ;
    }
}