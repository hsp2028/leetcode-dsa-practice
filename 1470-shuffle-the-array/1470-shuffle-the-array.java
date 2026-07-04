class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] ans = new int[m];
        for(int i=0; i<n; i++){
            ans[2*i] = nums[i];
        }
        for(int i=0; i<n; i++){
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }
}