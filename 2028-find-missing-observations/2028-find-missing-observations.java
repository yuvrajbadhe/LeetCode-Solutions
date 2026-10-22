class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum1 = 0 ;
        int sum2 = 0 ;
        int len = rolls.length + n ;
        for(int i = 0 ; i< rolls.length ; i++){
             sum1 = sum1 + rolls[i];
        }
        sum2 = (mean * len) - sum1 ;
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            int sum = sum2 / (n-i);
            arr[i] = sum ;
            if(sum > 6 || sum2< 0 || sum <1){
                return new int[0];
            }
            sum2 = sum2 - sum ;
        }
        return arr;
    }
}