class Solution {
    public int sumFourDivisors(int[] nums) {
        int maxsum = 0 ;
        int counter = 0 ;
        for(int i = 0; i<nums.length ; i++){
            int x= nums[i] ;
            int sum = 0 ;
            int count = 0 ;
            int s =(int) Math.sqrt(x); 
            for (int j = 1; j <= s ; j++){
                if(x % j == 0){
                    int j1 = x / j ;
                    if(j == j1){
                        sum = sum + j ;
                        count++ ;
                    }else{
                        sum = sum + j + j1 ;
                        count = count +2 ;
                    }
                   if(count >4){
                    break ;
                   }
                }
            }
            if(count == 4){
                maxsum =maxsum + sum ;
                counter++ ;
            }
        }
        if(counter >0){
            return maxsum ;
        }
        return 0 ;
    }
}