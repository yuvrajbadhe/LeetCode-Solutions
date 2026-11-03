class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int target = nums[nums.length-1];
        int count = 0 ;
        for(int i = 0; i<nums.length ; i++){
            int sum = target - nums[i] ;
            count = count + sum ;
        }
        return count ;
    }
}