class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long rangeSum = 0;
        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=i; j<n; j++){
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                rangeSum += (long)(max-min);
            }
        }
        return rangeSum;
    }
}