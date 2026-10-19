class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Bruteforce (TLE Problem)
        // int n = nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int n = nums.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                List<Integer> idx = map.get(nums[i]);
                idx.add(i);
                map.put(nums[i], idx);
            }
            else{
                List<Integer> idx = new ArrayList<>();
                idx.add(i);
                map.put(nums[i], idx);
            }
        }
        for(List<Integer> list : map.values()){
            if(list.size()>=2){
                for(int i=0; i<list.size()-1; i++){
                    if(Math.abs(list.get(i)-list.get(i+1))<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}