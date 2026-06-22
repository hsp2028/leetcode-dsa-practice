class Solution {
    private void reverse(int[] nums, int s, int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        // int l = nums.length;
        // k = k%l;  
        // int[] rotated = new int[l]; 
        // for(int j=0; j<l; j++){
        //     rotated[(j+k)%l] = nums[j];
        // }
        // for(int i=0; i<l; i++){
        //     nums[i] = rotated[i];
        // }

        // Bruteforce Solution TC=>O(nK) SC=>O(1) but TLE Problem

        // for(int i=0; i<k; i++){
        //     int last = nums[nums.length-1];
        //     for(int j=nums.length-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }

        // Better solution

        // int n = nums.length;
        // int[] num = new int[n];
        // k = k%n;
        // int i=0;
        // while(i<n && k<n){
        //     if(i<k){
        //         num[i] = nums[n-k+i];
        //         i++;
        //     } 
        //     else{
        //         num[i] = nums[i-k];
        //         i++;
        //     }
        // }
        // for(int j=0; j<n && k<n; j++){
        //     nums[j] = num[j];
        // }

        // Optimal Solution TC=>O(2n) SC=>O(1)

        int n = nums.length;
        k=k%n;
        reverse(nums, 0, n-1-k);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}