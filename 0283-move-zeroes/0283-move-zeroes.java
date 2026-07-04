class Solution {
    public void moveZeroes(int[] nums) {

        // Bruteforce Solution

        // int n = nums.length;
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=0){
        //         count++;
        //     }
        // }
        // int[] temp = new int[count]; 
        // int j=0;
        // int k=0;
        // while(j<n && k<count){
        //     if(nums[j]!=0){
        //         temp[k] = nums[j];
        //         k++;
        //     }
        //     j++;
        // }
        // for(int i=0; i<count; i++){
        //     nums[i] = temp[i];
        // }
        // for(int i=count; i<n; i++){
        //     nums[i] = 0;
        // }

        // Optimal Solution

        int n = nums.length;
        int j = -1;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1; i<n; i++){
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
}