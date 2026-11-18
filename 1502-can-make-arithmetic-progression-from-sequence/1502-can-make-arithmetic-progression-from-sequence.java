class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    int diff2 = Integer.MIN_VALUE ;
    for(int i = 0; i<arr.length-1;i++){
        int diff = arr[i+1] - arr[i];
        if(i==0){
            diff2 = arr[1] - arr[0];
        }
        if(diff != diff2){
            return false ;
        }
    }
    return true ;
    }
}
