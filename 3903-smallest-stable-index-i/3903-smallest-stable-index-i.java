class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // Bruteforce Solution
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j=0; j<=i; j++){
        //         max = Math.max(max, nums[j]);
        //     }
        //     int min = Integer.MAX_VALUE;
        //     for(int l=i; l<n; l++){
        //         min = Math.min(min, nums[l]);
        //     }
        //     int instability = max-min;
        //     if(instability<=k){
        //         return i;
        //     }
        // }
        // return -1;

        // Optimal Solution
        int n = nums.length;
        if(n==0){
            return -1;
        }
        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], nums[i]);
        }
        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }

        for(int i=0; i<n; i++){
            if(prefixMax[i]-suffixMin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}