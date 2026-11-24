class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i =0;i<nums.length-1;i++){
            if(count==0 && nums[i] != nums[i+1]){
                return nums[i];
            }
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                count = 0 ;
            }
        }
        return nums[nums.length-1];
    }
}