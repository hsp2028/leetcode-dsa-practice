class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int idx = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>target){
                j = mid-1;
            }
            else if(nums[mid]<target){
                i = mid+1;
            }
            else{
                idx = mid;
                break;
            }
        }
        return idx;
    }
}