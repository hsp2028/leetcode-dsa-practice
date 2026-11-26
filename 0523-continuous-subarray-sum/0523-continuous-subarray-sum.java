class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Bruteforce Solution
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         if(sum%k==0 && j-i+1>=2){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Optimal Solution
        // int n = nums.length;
        // int[] prefixSum = new int[n];
        // prefixSum[0] = nums[0];
        // for(int i=1; i<n; i++){
        //     prefixSum[i] = prefixSum[i-1]+nums[i];
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(prefixSum[i]%k==prefixSum[j]%k && j-i>=2){
        //             return true;
        //         } 
        //     }
        // }
        // return false;

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem, i);
            }
        }
        return false;
    }
}