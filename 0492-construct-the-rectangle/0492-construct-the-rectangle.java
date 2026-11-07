class Solution {
    public int[] constructRectangle(int area) {
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        int[] arr= {area,1};
        int a = (int) Math.sqrt(area);
        int s =a ;
        int e = a;
        int mindiff = 0 ;
        while(s>=e){
            if(s * e == area ){
                if(s>=e){
                    max = s ;
                }else{
                    max = e ;
                }
                if(s<e){
                    min = s ;
                }else{
                    min= e ;
                }
            
                arr[0] = max ;
                arr[1] = min ;
                return arr ;
            }
            if(s * e > area){
                e-- ;
            }else{
                s++ ;
            }
        }
        return arr ;
    }
}