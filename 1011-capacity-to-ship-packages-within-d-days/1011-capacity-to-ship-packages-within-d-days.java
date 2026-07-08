class Solution {
    public int daysTakenByShipWithCapacity(int capacity, int[] arr){
        int days = 1;
        int totalWeight = 0;
        for(int i=0; i<arr.length; i++){
            totalWeight += arr[i];
            if(totalWeight>capacity){
                totalWeight = arr[i];
                days++;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sumOfAllWeights = 0;
        int maxW = Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            sumOfAllWeights += weights[i];
            if(weights[i]>maxW){
                maxW = weights[i];
            }
        }
        int ans = Integer.MIN_VALUE;
        int l=maxW, r=sumOfAllWeights;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(daysTakenByShipWithCapacity(mid, weights)<=days){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}