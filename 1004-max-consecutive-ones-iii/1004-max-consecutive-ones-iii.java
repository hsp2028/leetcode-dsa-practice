class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0, zero = 0;
        for(int r=0, l=0; r<n; r++){
            if(nums[r]==0){
                zero++;
            }
            if(zero<=k){
                int len = r-l+1;
                maxLen = Math.max(maxLen, len);
            }
            else{
                while(zero>k){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                }
            }
        }
        return maxLen;
    }
}