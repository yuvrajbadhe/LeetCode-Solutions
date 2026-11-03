class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s= 0 ;
        int e = nums.length - 1 ;
        int[] arr = {-1,-1} ;
        while(s<=e){
            int mid = s + (e-s) /2 ;
            if(nums[mid] == target){
                arr[0] = mid ;
            }
            if(target>nums[mid]){
                s=mid+1 ;
            }else{
                e =mid-1 ;
            }
        }
        int s1 = 0;
        int e1 =nums.length - 1 ;
        while(s1<=e1){
            int mid = s1 + (e1-s1) /2 ;
            if(nums[mid] == target){
                arr[1] = mid ;
            }
            if(target<nums[mid]){
                e1 =mid-1 ;
            }else{
                s1=mid+1 ;                
            }
        }
        return arr ;
    }
}