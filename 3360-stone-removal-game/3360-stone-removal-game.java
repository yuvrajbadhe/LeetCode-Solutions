class Solution {
    public boolean canAliceWin(int n) {
       for(int i = 10; i>0 && n >=0;i--){
        if(i>n && i%2 !=0){
            return true;
        }
            n = n -i ;
       } 
       return false ;
    }
}
