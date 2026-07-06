class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        while(sum>0){
            int x = sum;
            sum = 0;
            while(x>0){
                int digit = x%10;
                sum += digit*digit;
                x = x/10;
            }
            if(sum==1){
                return true;
            }
            if(sum==7){
                continue;
            }
            if(sum<10 && sum!=1){
                break;
            }
        }
        return false;
    }
}