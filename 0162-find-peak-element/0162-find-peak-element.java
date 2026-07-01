class Solution {
    public int findPeakElement(int[] nums) {
        // int idx = -2;
        // if(nums.length == 1) return 0;
        // for(int i=0; i<nums.length; i++){
        //     if(i==0){
        //         if(nums[i] > nums[i+1]){
        //             return i;
        //         }
        //     }
        //     else if(i==nums.length-1){
        //         if(nums[i] > nums[i-1]){
        //             return i;
        //         }
        //     }
        //     else if(nums[i]>nums[i+1] && nums[i] > nums[i-1]){
        //         idx = i;
        //         break;
        //     }
        // }
        // return idx;

        // Optimal Way
        int i=1, j=nums.length-2;
        int idx=-2;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                idx = mid;
                break;
            }
            else if(nums[mid]>nums[mid-1]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return idx;
    }
}