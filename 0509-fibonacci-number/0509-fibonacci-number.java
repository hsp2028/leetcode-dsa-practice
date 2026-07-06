class Solution {
    private int fibc(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibc(n-1)+fibc(n-2);
    }
    public int fib(int n) {
        int result = fibc(n);
        return result;
    }
}