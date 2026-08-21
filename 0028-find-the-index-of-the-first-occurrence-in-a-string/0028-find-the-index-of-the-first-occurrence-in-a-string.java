class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder series = new StringBuilder();
        int n = needle.length();
        for (int i = 0 ; i< haystack.length() ; i++){
            char x = haystack.charAt(i) ;
            // char ch = ' ';
            //  ch = (char)(ch + x);
            series.append(x);
            // if(series.equals(needle)){
            if(series.length() > n ){
                series.deleteCharAt(0);
            }
            if (series.toString().equals(needle)) {
                return i - n + 1;
            }
        }
        return -1 ;
    }
}