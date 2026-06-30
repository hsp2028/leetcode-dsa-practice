class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Bruteforce Solution
        // int n = nums.length;
        // int num = 0;
        // if(n==1) return nums[0];
        // for(int i=0; i<n; i++){
        //     if(i==0){
        //         if(nums[i] != nums[i+1]){
        //             return nums[i];
        //         }
        //     }
        //     else if(i == n-1){
        //         if(nums[i] != nums[i-1]){
        //             return nums[i];
        //         }
        //     }
        //     else{
        //         if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
        //             num = nums[i];
        //         }
        //     }
        // }
        // return num;

        // Better Solution

        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int i=1, j=n-2;
        int ans = 0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                ans = nums[mid];
            }
            if((mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid%2 != 0 && nums[mid] == nums[mid-1])){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
}