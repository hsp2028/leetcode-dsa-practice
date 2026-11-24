class Solution {
    public int[] leftRightDifference(int[] nums) {
        // Bruteforce Solution
        // int n = nums.length;
        // int[] ans = new int[n];
        // int[] left = new int[n];
        // left[0] = 0;
        // int[] right = new int[n];
        // right[n-1] = 0;
        // for(int i=1; i<n; i++){
        //     left[i] = left[i-1]+nums[i-1];
        // }
        // for(int i=n-2; i>=0; i--){
        //     right[i] = right[i+1]+nums[i+1];
        // }
        // for(int i=0; i<n; i++){
        //     ans[i] = Math.abs(left[i]-right[i]);
        // }
        // return ans;

        // Optimize Solution
        int n = nums.length;
        int[] ans = new int[n];
        int total = 0;

        for(int num : nums){
            total += num;
        }

        int leftSum = 0;
        for(int i=0; i<n; i++){
            int rightSum = total-leftSum-nums[i];
            ans[i] = Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}