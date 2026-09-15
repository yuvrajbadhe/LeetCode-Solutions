class Solution {
    public int search(int[] nums, int target ) {
        // if(s>e){
        //     return -1 ;
        // }
        // int m = s+ (e -s)/2 ;
        // if(nums[m] == target ){
        //     return m ;
        // }
        // if(nums[m] < target){
        //     return search(nums,target , m+1 ,e);
        // }
        // return serach(nums ,target,s ,m-1 ) ;
        
        if(nums.length == 1){
            if(nums[0] == target){
            return 0 ;
            }
        }
        int s =0 ;
        int e = nums.length -1 ;
        while(s<= e){
           int m = s+ (e -s)/2 ;
           if(nums[m] == target ){
            return m ;
           }
           if(nums[m] < target){
             s= m+1 ;
           }else{
            e =m -1 ;
           }
        }
          return -1 ;
    }
    
}