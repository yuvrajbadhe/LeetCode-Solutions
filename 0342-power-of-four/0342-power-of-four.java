class Solution {
    public boolean isPowerOfFour(int n) {
        return power(n ,0);
    }
    public boolean power(int n , int x){
          if(n==Math.pow(4,x)){
              return true ;
          }
          if(Math.pow(4,x) < n){
          return power(n , ++x );
          }
          return false ;
    }
}