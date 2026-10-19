class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i=0;
        while(i<n){
            StringBuilder sb = new StringBuilder();
            if(i<n-1 && nums[i]==nums[i+1]-1){
                int start = nums[i];
                i++;
                while(i<n-1 && nums[i]==nums[i+1]-1){
                    i++;
                }
                int end = nums[i];
                i++;
                sb.append(String.valueOf(start));
                sb.append("->");
                sb.append(String.valueOf(end));
                ans.add(sb.toString());
            }
            else{
                ans.add(String.valueOf(nums[i]));
                i++;
            }
        }
        return ans;
    }
}