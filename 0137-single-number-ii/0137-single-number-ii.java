class Solution {
    public int singleNumber(int[] nums) {
        // Using HashMap
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue()==1){
        //         return entry.getKey();
        //     }
        // }
        // return 0;

        // Using Bit Manipulation
        int ones = 0;
        int twos = 0;
        for(int n : nums){
            ones = (ones^n) & ~twos;
            twos = (twos^n) & ~ones;
        }

        return ones;
    }
}