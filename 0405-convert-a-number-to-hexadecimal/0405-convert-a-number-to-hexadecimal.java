// class Solution {
//     public String toHex(int num) {
//     //    String str =new String(Integer.toHexString(num));
//     //    return str ;
//     int x = num ;
//     while(x>0){
//         x =x/ 16 ;
//     String y = switch (x) {
//     case 0 -> '0';
//     case 1 -> '1';
//     case 2 -> '2';
//     case 3 -> '3';
//     case 4 -> '4';
//     case 5 -> '5';
//     case 6 -> '6';
//     case 7 -> '7';
//     case 8 -> '8';
//     case 9 -> '9';
//     case 10 -> 'A';
//     case 11 -> 'B';
//     case 12 -> 'C';
//     case 13 -> 'D';
//     case 14 -> 'E';
//     case 15 -> 'F';
//     default -> '?';
// };
//     String z = null
//     }

//     }

// }

class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder result = new StringBuilder();
        
        // Loop until all 32 bits are shifted out
        while (num != 0) {
            // Take the last 4 bits using bitwise AND (& 15)
            result.append(hexDigits[num & 15]);
            
            // Unsigned right shift (>>>) fills left bits with 0s
            // This handles negative numbers automatically via two's complement
            num >>>= 4;
        }
        
        // Reverse because digits were extracted right-to-left
        return result.reverse().toString();
    }
}