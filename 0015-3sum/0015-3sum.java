// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i = 0 ; i< nums.length -2 ; i++){
//             for(int j = i+1 ; j< nums.length - 1 ; j++){
//                 for(int k = j+1 ; k<nums.length ; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> list2 = new ArrayList<>();
//                         list2.add(nums[i]);
//                         list2.add(nums[j]);
//                         list2.add(nums[k]);                      
//                         int count = 0 ;
//                         for(int x =0 ; x< list.size() ; x++){
//                             if(list.contains(list2)){
//                                 count++ ;
//                             }
//                         }
//                         if(count == 0){
//                             list.add(list2);
//                         }
//                     }
//                 }
//             }
//         }
//         return list ;
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start= i +1 ;
            int end = nums.length - 1 ;
            while(start< end){
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0){
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[start]);
                    list2.add(nums[end]); 
                    list.add(list2);

                    while(start < end && nums[start] == nums[start + 1]){
                        start++ ;
                    }
                    while(start < end && nums[end] == nums[end - 1]){
                        end-- ;
                    }
                    start++;
                    end-- ;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return list ;
    }
}
