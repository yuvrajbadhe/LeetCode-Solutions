class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0 ;
        for(int i = 0 ; i<arr1.length;i++){
            int counter = 0 ;
            for(int j = 0 ; j<arr2.length ; j++){
                int sum = arr1[i] - arr2[j] ;
                if(sum<0){
                    sum = sum * -1 ;
                }
                if(sum <= d){
                    counter++ ;
                }
            }
            if(counter == 0){
                count++ ;
            }
        }
        return count ;
    }
}