class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        int mid = (n-1)/2;
        int target = 0 ;
        int count = 0;
        if(n%2 == 0){
            target = (nums[mid] + nums[mid+1])/2 ;
        }else{
            target =nums[mid];
        }

        for(int i = 0 ;i<nums.length;i++){
            int count2 = 0 ;
            if(nums[i] >= target){
                count2 = nums[i] - target ;
            }else{
                count2 = target - nums[i] ;
            }
            count = count + count2 ;
        }
        return count;
    }
}