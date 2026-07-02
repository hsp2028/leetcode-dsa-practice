class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int first = nums[i];
            int sec = target-first;
            if(map.containsKey(sec)){
                return new int[] {i, map.get(sec)};
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }
}