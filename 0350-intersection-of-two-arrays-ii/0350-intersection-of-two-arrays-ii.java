class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // List<Integer> list = new ArrayList<>();
        // int i=0; 
        // int j=0;
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // while(i<n1 && j<n2){
        //     if(nums1[i]==nums2[j]){
        //         list.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        //     else if(nums1[i]>nums2[j]){
        //         j++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // int size = list.size();
        // int[] ans = new int[size];
        // for(int k=0; k<size; k++){
        //     ans[k] = list.get(k);
        // }
        // return ans;

        // Using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num, map.getOrDefault(num, 0)-1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}