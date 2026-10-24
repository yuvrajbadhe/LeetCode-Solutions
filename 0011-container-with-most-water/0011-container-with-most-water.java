class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int s = 0 ;
        int e = height.length - 1 ;
        while(e>s){
            int min = Math.min(height[s] ,height[e]);
            if(min * (e-s) > max){
                max = min * (e-s) ;
            }
            if(height[s]>height[e]){
                e=e-1;
            }else{
                s=s+1;
            }
        }
        return max ;
    }
}