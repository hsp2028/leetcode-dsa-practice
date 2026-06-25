class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        int l=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<l-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = l-1;

            while(j<k){
                int total = nums[i] + nums[j] + nums[k];
                if(total>0){
                    k--;
                }
                else if(total<0){
                    j++;
                }
                else{
                    list1.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return list1;
        
        // Bruteforce Solution -> TLE Problem
        // Set<List<Integer>> list = new HashSet<>();
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j=i+1; j<n; j++){
        //         int kth = -(nums[i]+nums[j]);
        //         if(set.contains(kth)){
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], kth);
        //             Collections.sort(temp);
        //             list.add(temp);
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(list);
    }
}