class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int minNum = Integer.MAX_VALUE;
        int lower=0, higher=n-1;
        while(lower<=higher){
            int mid = lower+(higher-lower)/2;
            if(nums[lower]<=nums[mid]){
                minNum = Math.min(minNum, nums[lower]);
                lower = mid+1;
            }
            else{
                minNum = Math.min(minNum, nums[mid]);
                higher = mid-1;
            }
        }
        return minNum;
    }
}