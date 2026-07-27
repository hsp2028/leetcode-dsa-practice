class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        for(int i=0; i<n; i++){
            int crrE = nums[i];
            for(int j=1; j<n; j++){
                int idx = (i+j)%n;
                if(nums[idx]>nums[i]){
                    res[i] = nums[idx];
                    break;
                }
            }
        }
        return res;
    }
}