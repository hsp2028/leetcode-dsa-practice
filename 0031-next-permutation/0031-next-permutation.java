class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            swap(nums, s, e);
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == -1){
            reverse(nums);
        }
        else{
            int minDiff = Integer.MAX_VALUE;
            int nextVal = 0;
            int diff = 0;
            for(int i=breakPoint+1; i<n; i++){
                if(nums[i]>nums[breakPoint]){
                    diff = nums[i]-nums[breakPoint];
                    if(minDiff>diff){
                        minDiff = diff;
                        nextVal = i;
                    }
                }
            }
            swap(nums, breakPoint, nextVal);
            for(int i=breakPoint+1; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(nums[i]>nums[j]){
                        swap(nums, i, j);
                    }
                }
            }
        }
    }
}