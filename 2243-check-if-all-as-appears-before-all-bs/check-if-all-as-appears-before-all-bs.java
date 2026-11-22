class Solution {
    public boolean checkString(String s) {
        int count = 0 ;
        char a = 'a' ;
        char b = 'b';
        for(int i=0; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == b){
                count++ ;
            }
            if(count >0 && ch == a){
                return false ;
            }
        }
        return true ;
    }
}