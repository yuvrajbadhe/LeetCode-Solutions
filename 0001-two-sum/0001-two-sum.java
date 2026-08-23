class Solution {
    public int[] twoSum(int[] nums, int target) {
        //   int[] a = new int[2];
        // int x = 0 ;
        // int y = nums.length- 1;
        // Arrays.sort(nums);
        // while(x<y){
        //     int z = nums[x]+nums[y];
        //     if (target < z){
        //         y -- ;
        //     }
        //     if (target >z){
        //         x++ ;
        //     }
          
        //     if (z == target){
        //        a[0] = x ;
        //        a[1] = y ;
        //       return a ; 
        //     }
        // }
        // return a;


        for(int i = 0 ; i< nums.length -1; i++ ){
            for(int j = i +1 ; j< nums.length ; j++ ){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1 ,-1} ;
    }
}