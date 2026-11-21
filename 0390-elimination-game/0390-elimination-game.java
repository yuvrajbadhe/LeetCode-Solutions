// class Solution {
//     public int lastRemaining(int n) {
//         int count = 0 ;
//         int[] arr = new int[n] ;
//         for(int i = 0;i<n ; i++){
//             arr[i] = i + ;
//         }
//         for(int i =0; i<n ; i++){
//             for(int j = 0 ; j<n && arr[j] != 0 ; j++){
//                 arr[j] = 0;
//                 j++ ;
//             }
//             for(int k = n-2;)
//         }
//     }
// }

class Solution {
    public int lastRemaining(int n) {
        int ans = 1;
        int s = 1;
        boolean left = true;
        while (n > 1) {
            if (left || n % 2 == 1) {
                ans = ans + s;
            }
            n = n / 2;
            s = s * 2;
            left = !left;
        }
        return ans;
    }
}