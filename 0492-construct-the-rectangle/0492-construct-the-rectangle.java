class Solution {
    public int[] constructRectangle(int area) {
        int[] arr= {area,1};
        int a = (int) Math.sqrt(area);
        int s =(int) Math.sqrt(area); ;
        int e = s;
        int mindiff = 0 ;
        while(s>=e){
            if(s * e == area ){
                arr[0] = s;
                arr[1] = e ;
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