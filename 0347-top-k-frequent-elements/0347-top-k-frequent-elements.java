class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer>[] bucket = new List[n+1];
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int counter = 0;
        int[] res = new int[k];
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i] != null){
                for(int m : bucket[i]){
                    res[counter] = m;
                    counter++;
                }
            }
        }
        return res;
    }
}