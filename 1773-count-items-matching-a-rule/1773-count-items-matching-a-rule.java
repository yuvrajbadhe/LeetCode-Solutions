class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int x = items.size();
        // int a = 0;
        // int b =1 ;
        // int c = 2;
        if(ruleKey.equals("type")){
            for(int i = 0 ; i<x ;i++){
                if(ruleValue.equals(items.get(i).get(0))){
                    ans =ans+1 ;
                }
            }
            return ans;
        }
        if(ruleKey.equals("color")){
            for(int i = 0 ; i<x ;i++){
                if(ruleValue.equals(items.get(i).get(1))){
                    ans =ans+1 ;
                }
            }
            return ans;
        } 
        if(ruleKey.equals("name")){
            for(int i = 0 ; i<x ;i++){
                if(ruleValue.equals(items.get(i).get(2))){
                    ans =ans+1 ;
                }
            }
            return ans;
        }
        return ans;
    }
}