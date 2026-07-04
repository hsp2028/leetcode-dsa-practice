
class Solution {
    public int longestConsecutive(int[] nums) {
        
        // Bruteforce
        int n = nums.length;
        Arrays.sort(nums);

        int maxLength = 1;
        int length = 1;
        if(n==0){
            return 0;
        }
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i]+1 == nums[i+1]){
                length++;
            }
            else{
                if(length>maxLength){
                    maxLength = length;
                }
                length = 1;
            }
        }
        if(length > maxLength){
            maxLength = length;
        }
        return maxLength;

        // Optimized solution

        // int n = nums.length;
        // int longest = 1;
        // HashSet<Integer> set = new HashSet<>();
        // if(n==0){
        //     return 0;
        // }
        // for(int i=0; i<n; i++){
        //     set.add(nums[i]);
        // }
        // for(Integer N: set){
        //     if(!set.contains(N-1)){
        //         int count = 1;
        //         int x = N;
        //         while(set.contains(x+1)){
        //             x++;
        //             count++;
        //         }
        //         longest = Math.max(longest, count);
        //     }
        // }
        // return longest;
    }
}