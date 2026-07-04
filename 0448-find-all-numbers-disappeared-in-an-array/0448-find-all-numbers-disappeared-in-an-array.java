class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     set.add(nums[i]);
        // }
        // for(int i=1; i<=n; i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx] *= -1;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}