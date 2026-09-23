class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for(int i=0; i<nums.length; i++){
        //     if(set.contains(nums[i])){
        //         return nums[i];
        //     }
        //     set.add(nums[i]);
        // }
        // return 0;


        // using slow and fast pointer

        int slow=nums[0];
        int fast=nums[nums[0]];

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
        }
        slow = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}