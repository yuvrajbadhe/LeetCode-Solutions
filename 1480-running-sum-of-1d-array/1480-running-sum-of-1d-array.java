class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i= 0; i <nums.length ; i++){
          int x= 0 ;
          for(int j = 0 ; j <= i ;j++ ){
            x= nums[j]+x;
          }
          arr[i]=x ;
        }
        return arr ;
    }
}