class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -x;
        }
        int temp = x;
        long reversed = 0;
        while(temp>0){
            int digit = temp%10;
            reversed = reversed*10+digit;
            temp = temp/10;
        }
        if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE){
            return 0;
        }
        return (isNegative) ? (int)-reversed : (int)reversed; 
    }
}