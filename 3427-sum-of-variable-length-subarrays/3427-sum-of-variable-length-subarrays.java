class Solution {
    public int subarraySum(int[] nums) {
        // Bruteforce Solution
        // int n = nums.length;
        // int ans = 0;
        // for(int i=0; i<n; i++){
        //     int start = Math.max(0, i-nums[i]);
        //     int sum = 0;
        //     for(int j=start; j<=i; j++){
        //         sum += nums[j];
        //     }
        //     ans += sum;
        // }
        // return ans;

        // Optimize Solution

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] += prefix[i-1]+nums[i];
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            int start = Math.max(0, i-nums[i]);

            if(start==0){
                ans += prefix[i];
            }
            else{
                ans += prefix[i]-prefix[start-1];
            }
        }
        return ans;
    }
}