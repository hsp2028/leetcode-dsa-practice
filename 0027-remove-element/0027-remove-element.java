class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        int i=-1; 
        int j=0;
        while(j<n){
            if(nums[j]!=val){
                i++;
                nums[i] = nums[j];
                j++;
            }
            else{
                j++;
            }
        }
        return i+1;
    }
}