class Solution {
    public List<String> letterCombinations(String digits) {
        String reversed = "";
        for (int i = digits.length() - 1; i >= 0; i--) {
            reversed += digits.charAt(i);
        }
       return padList("" , reversed) ;
    }
    static ArrayList<String> padList(String p , String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p);
            return list ;
        }
        int digit = up.charAt(0) - '0';
       ArrayList<String> list = new ArrayList<>() ;
       
       if(digit > 1 && digit < 7){
       for(int i = ((digit -1) * 3 ) -3 ; i < (digit * 3 ) - 3 ; i++){
           char ch = (char) ('a' + i);
           list.addAll(padList(ch + p , up.substring(1)));
       }
       }
        if(digit == 7){
        for(int i = (digit -1) * 3 - 3; i < (digit * 3) - 2 ; i++){
           char ch = (char) ('a' + i);
           list.addAll(padList(ch + p , up.substring(1)));
       }
       }
       if(digit == 8){
        for(int i = (digit -1) * 3 -2 ; i < (digit * 3 ) - 2 ; i++){
           char ch = (char) ('a' + i);
           list.addAll(padList(ch + p , up.substring(1)));
       }
       }
       if(digit == 9){
        for(int i = (digit -1) * 3 - 2; i < (digit * 3) - 1 ; i++){
           char ch = (char) ('a' + i);
           list.addAll(padList(ch + p , up.substring(1)));
       }
       }
    return list ;
    }
}