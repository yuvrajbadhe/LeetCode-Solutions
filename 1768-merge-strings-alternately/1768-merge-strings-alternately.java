class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = new String();
        int x =word1.length();
        int y= word2.length();
        int a =0;
        int len ;
        if(x<=y){
            len = x;
        }else{
            len = y ;
        }
        for(int i =0 ; i<len ;i++){
            char ch1 = word1.charAt(0);
            char ch2 = word2.charAt(0);
            ans = ans + ch1 + ch2 ;
            word1 = word1.substring(1);
            word2 = word2.substring(1);
            a++ ;
        }
        if(x>a){
            for(int i = a; i < x ; i++){
                char ch1 = word1.charAt(0);
                word1 = word1.substring(1);
                ans = ans + ch1 ;
            }
        }
        if(y>a){
            for(int i = a; i < y ; i++){
                char ch2 = word2.charAt(0);
                word2 = word2.substring(1);
                ans = ans + ch2 ;
            }
        }
    return ans ;
    }
}