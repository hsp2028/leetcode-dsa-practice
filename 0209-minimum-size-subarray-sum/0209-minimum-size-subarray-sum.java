class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int n = nums.length;
        // int minLen = Integer.MAX_VALUE;
        // for(int i=0; i<n; i++){
        //     int sum = 0; 
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         if(sum>=target){
        //             minLen = Math.min(minLen, j-i+1);
        //         }
        //     }
        // }
        // if(minLen!=Integer.MAX_VALUE){
        //     return minLen;
        // }
        // return 0;

        int n = nums.length;
        int i=0, j=0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while(j<n){
            sum += nums[j];
            j++;
            while(sum>=target){
                minLen = Math.min(minLen, j-i);
                sum -= nums[i];
                i++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}