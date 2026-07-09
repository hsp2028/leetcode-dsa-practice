class Solution {
    private int numberOfGroups(int m, int[] nums){
        int groupsCount=1;
        int currentSum = 0;
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            if(currentSum>m){
                groupsCount++;
                currentSum=nums[i];
            }
        }
        return groupsCount;
    }
    public int splitArray(int[] nums, int k) {
        int maxE = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(nums[i]>maxE){
                maxE = nums[i];
            }
        }
        int low = maxE;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(numberOfGroups(mid, nums)<=k){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}