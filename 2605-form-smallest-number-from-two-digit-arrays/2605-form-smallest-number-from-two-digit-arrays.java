class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int a = 9 ;
        int b = 9 ;
        int x1 = 10 ;
        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j< nums2.length ; j++){
               
                if(nums1[i] == nums2[j]){
                 if(nums1[i] < x1){
                    x1 = nums1[i];
                }
                }
            }
        }
        if(x1< 10){
            return x1 ;
        }
       
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] < a){
                a = nums1[i] ;
            }
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if(nums2[i] < b){
                b = nums2[i] ;
            }
        } 
        if(a < b){
            return ((a * 10 ) + b) ;
        }
        return ((b * 10 ) + a) ;
    }
}