class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0;
        while(i<=nums.length-1){
            int j = i+1;
            while(j <= nums.length-1 && nums[i] == nums[j]){
                j++;
            }
            if(i>=nums.length){
                break;
            }
            nums[k] = nums[i];
            i=j;
            k++;
        }
        return k;
    }
}