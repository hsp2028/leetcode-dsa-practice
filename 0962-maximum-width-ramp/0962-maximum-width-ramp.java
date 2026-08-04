class Solution {
    public int maxWidthRamp(int[] nums) {
        // Bruteforce Solution -> TLE Problem
        // int n = nums.length;
        // int maxW = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(nums[i]<=nums[j]){
        //             int w = j-i;
        //             maxW = Math.max(w, maxW);
        //         }
        //     }
        // }
        // return maxW;

        // Better Solution

        int n = nums.length;
        int[] maxV = new int[n];
        maxV[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            maxV[i] = Math.max(maxV[i+1], nums[i]);
        }
        int i=0, j=0;
        int maxWidth=0;
        while(j<n){
            if(nums[i]<=maxV[j]){
                maxWidth = Math.max(maxWidth, j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxWidth;
    }
}