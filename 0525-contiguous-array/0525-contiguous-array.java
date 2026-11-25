class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int prefixSum = 0;
        for(int i=0; i<n; i++){
            prefixSum += (nums[i]==1) ? 1 : -1;
            if(map.containsKey(prefixSum)){
                ans = Math.max(ans, i-map.get(prefixSum));
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return ans;
    }
}