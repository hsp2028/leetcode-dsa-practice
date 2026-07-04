class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void permutation(int[] nums, int idx, List<List<Integer>> ans){
        int n = nums.length;
        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int number:nums){
                list.add(number);
            }
            ans.add(list);
            return;
        }
        for(int i=idx; i<n; i++){
            swap(nums, idx, i);
            permutation(nums, idx+1, ans);
            swap(nums, idx, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums, 0, ans);
        return ans;
    }
}