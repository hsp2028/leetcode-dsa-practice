class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0;
        // int k=0;
        // while(i<=nums.length-1){
        //     int j = i+1;
        //     while(j <= nums.length-1 && nums[i] == nums[j]){
        //         j++;
        //     }
        //     if(i>=nums.length){
        //         break;
        //     }
        //     nums[k] = nums[i];
        //     i=j;
        //     k++;
        // }
        // return k;

        // Practice Solution

        // int n=nums.length;
        // int k=1, i=0, j=i+1;
        // while(i<n && j<n){
        //     while(j<n && nums[j] == nums[i]){
        //         j++;
        //     }
        //     if(j<n){
        //         nums[i+1] = nums[j];
        //         i++;
        //         j++;
        //         k++;
        //     }
        // }
        // return k;

        // Optimal Solution

        int n = nums.length;
        int j=0;
        for(int i=1; i<n; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}