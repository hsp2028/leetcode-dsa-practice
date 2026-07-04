class Solution {
    public int subarraySum(int[] nums, int k) {
        // Bruteforce Solution
        
        // int n = nums.length;
        // int sum = 0;
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];

        //         if(sum == k){
        //             count++;
        //         }
        //     }
        //     sum = 0;
        // }
        // return count;

        // Optimal Solution
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}