class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a = new int[2];
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    a[0] = nums[i];
                    a[1] = j+1; 
                }
            }
        }

        for(int i=1; i<=n; i++){
            boolean set = false;
            for(int j=0; j<n; j++){
                if(nums[j]==i){
                    set = true;
                    break;
                }
            }
            if(!set){
                a[1] = i;
            }
        }
        return a;
    }
}