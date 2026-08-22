class Solution {
    public int[] shuffle(int[] nums, int n) {
    //   ArrayList<Integer> list = new ArrayList<>(2*n) ;
    int[] list = new int[2*n];
    int x= 0 ;
      for(int i =0 ; i<n ; i++){

        list[x]= nums[i];
        int y = x+1 ;
        list[y] = nums[n + i];
        x= x+2 ;
      }  
      return list ;
    }
}