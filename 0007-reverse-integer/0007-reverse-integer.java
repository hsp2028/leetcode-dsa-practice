// class Solution {
//     public int reverse(int x) {
//         boolean isNegative = false;
//         if(x<0){
//             isNegative = true;
//             x = -x;
//         }
//         long reversed = 0;
//         while(x>0){
//             int digit = x%10;
//             reversed = reversed*10+digit;
//             x = x/10;
//         }
//         if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE){
//             return 0;
//         }
//         return (isNegative) ? (int)-reversed : (int)reversed; 
//     }
// }

class Solution {
    public int reverse(int x) {
        long reversed = 0;
        
        while (x != 0) {
            // Extract the last digit (handles both positive and negative numbers automatically)
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        // Check for 32-bit signed integer overflow
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
}
