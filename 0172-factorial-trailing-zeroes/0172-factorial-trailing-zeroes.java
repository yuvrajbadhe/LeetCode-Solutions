// class Solution {
//     public int trailingZeroes(int n) {
//         int a = fact(n) ;
//         int count = 0 ;
//         while(a>0){
//             int b = a%10 ;
//             if(b==0){
//                 count++ ;
//             }
//             a = a/10 ;
//             b = a%10 ;
//             if(b!=0){
//                 break ;
//             }
//         }
//         return count ;
//     }
//     public int fact(int n) {
//         if (n <= 1) {
//             return 1;
//         }
//         return n * fact(n - 1);
//     }
// }

class Solution {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        return count;
    }
}