// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
        
//     }
// }

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length ;
        int max = 0 ;

        int[] arr = new int[n];

        // Find suffix minimum
        arr[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i] = Math.min(nums[i], arr[i + 1]);
        }

       
        for(int i = 0 ;  i< n ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            int min = arr[i];
            
            // for (int j = i; j < n ; j++) {
            //      min = Math.min(min, nums[j]);
            // }
            if(max - min <= k){
                return i ;
            }
        }
        return -1 ;
    }
}