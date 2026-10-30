class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =  1 ;
        int x = 1 ;
        int count = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                x = 0 ;
                count++ ;
            }else{
                product = product * nums[i] ;
            }
        }
        int[] arr = new int[nums.length];
        for(int i = 0 ; i<arr.length ; i++){
            if(nums[i] == 0){
                arr[i] = product ;
                if(count > 1){
                    arr[i] =product * x;
                }
            }else{
                arr[i] = (product / nums[i]) * x ;
            }
        }
        return arr ;
    }
}