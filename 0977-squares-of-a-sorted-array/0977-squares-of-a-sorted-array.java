class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int zIdx = -1;
        for(int i=0; i<n; i++){
            nums[i] *= nums[i];
            if(nums[i]<=0){
                zIdx = i;
            }
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }
}