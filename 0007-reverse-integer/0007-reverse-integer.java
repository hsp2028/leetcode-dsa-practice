class Solution {
    public int reverse(int x) {
        // boolean isNegative = false;
        // if(x<0){
        //     isNegative = true;
        //     x = -x;
        // }
        int reversed = 0;
        while(x!=0){
            int digit = x%10;
            if(reversed>Integer.MAX_VALUE/10 || (reversed==Integer.MAX_VALUE && digit > 7)){
                return 0;
            }
            if(reversed<Integer.MIN_VALUE/10 || (reversed==Integer.MIN_VALUE && digit < -8)){
                return 0;
            }
            reversed = reversed*10+digit;
            x = x/10;
        }
        // if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE){
        //     return 0;
        // }
        // return (isNegative) ? (int)-reversed : (int)reversed; 
        return (int) reversed;
    }
}