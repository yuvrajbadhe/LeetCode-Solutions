// class Solution {
//     public int specialArray(int[] nums) {
//         int x = nums.length ;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] < 1){
//                 x = x-1 ;
//             }
//         }

//         int y = 0 ;
//         for(int j = 0 ; j < nums.length ; j++){
//             if(nums[j] > 0){
//                 if(nums[j] < x ){
//                     return -1 ;
//                 }
//             }
//             y = y + nums[j] ;
//         }
//         if(y == 0 ){
//             return -1 ;
//         }
//         return x ;
//     }
// }

// class Solution {
//     public int specialArray(int[] nums) {
//         Arrays.sort(nums);
//         int x = nums.length ;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] < 1){
//                 x = x-1 ;
//             }
//         }
//         for(int i = 0 ; i < nums.length -1 ; i++){
//             if(nums[i] == nums[i+1]){
//                 x= x-1 ;
//             }
//         }
//         int count = 0 ;
//         if(x < nums.length){
//           for(int j = 0 ; j < nums.length ; j++ ){
//             if(nums[j] >= x){
//               count = count + 1 ;  
//             }
//           }
//           if(count == x){
//             return x ;
//           }
//         }
//         int y = 0 ;
//         for(int j = 0 ; j < nums.length ; j++){
//             if(nums[j] > 0){
//                 if(nums[j] < x ){
//                     return -1 ;
//                 }
//             }
//             y = y + nums[j] ;
//         }
//         if(y == 0 ){
//             return -1 ;
//         }
//         return x ;
//     } 
// }


class Solution {
    public int specialArray(int[] nums) {
        // Arrays.sort(nums) ;
        for(int i =1 ; i <= nums.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] >= i ){
                    count = count +1 ;
                }
            }
            if(count == i){
                return i ;
            }
        }
        return -1 ;
    }
}