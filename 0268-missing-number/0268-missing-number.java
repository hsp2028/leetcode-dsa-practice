class Solution {
    public int missingNumber(int[] nums) {
        
        // Bruteforce Solution
        
        // int n = nums.length;
        // int missingNumber=-1;
        // for(int i=0; i<=n; i++){
        //     int flag = 0;
        //     for(int j=0; j<n; j++){
        //         if(i==nums[j]){
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         missingNumber = i;
        //     }
        // }
        // return missingNumber;

        // Optimal Solution:

        // 1) Sum

        int n = nums.length;
        int sum1 = 0;
        for(int i=0; i<n; i++){
            sum1 += nums[i];
        }
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 = n*(n+1)/2;
        }
        return sum2-sum1;

        // 2) XOR
        // int n = nums.length;
        // int xor1 = 0;
        // int xor2 = 0;
        // for(int i=0; i<n; i++){
        //     xor1 ^= nums[i];
        // }
        // for(int i=0; i<n; i++){
        //     xor2 ^= i;
        // }
        // return xor1^xor2;
    }
}