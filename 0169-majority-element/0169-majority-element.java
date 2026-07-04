class Solution {
    public int majorityElement(int[] nums) {

        // Bruteforce solution

        // int m=nums.length;
        // for(int i=0; i<m; i++){
        //     int count=0;
        //     for(int j=0; j<m; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>m/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // Better Solution

        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue()>n/2){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        // Optimized Solution

        int n = nums.length;
        int count = 0;
        int el=-1;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1; 
                el = nums[i];
            }
            else if (nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == el){
                count1++;
            }
        }
        if(count1++>n/2){
            return el;
        }
        return -1;
    }
}