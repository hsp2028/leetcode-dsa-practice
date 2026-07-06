class Solution {
    public long bananaEatenAtSpeedK(int n, int[] arr, int h){
        long count=0;
        for(int i=0; i<arr.length; i++){
            count += ((long)arr[i]+n-1)/n;
            if(count>h){
                return count;
            }
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int k = 0;
        int maxE = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxE = Math.max(maxE, piles[i]);
        }
        int i=1, j=maxE;
        int ans = 0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(bananaEatenAtSpeedK(mid, piles, h)<=h){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
}