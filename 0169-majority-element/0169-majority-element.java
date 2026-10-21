// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i = 0 ; i<nums.length - 1 ; i++){
//             int count = 1;
//             for(int j = i+1 ; j<nums.length ; j++){
//                 if(nums[i]== nums[j]){
//                     count++;
//                 }
//             } 
//             if(count > nums.length/2){
//                 return nums[i];
//             }
//         }
//         return  nums[0];
//     }
// }


class Solution {
  public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
            }
            if (nums[i] == ans) {
                count++;
            } else {
                count--;
            }
        }
        
        return ans;
    }
}    