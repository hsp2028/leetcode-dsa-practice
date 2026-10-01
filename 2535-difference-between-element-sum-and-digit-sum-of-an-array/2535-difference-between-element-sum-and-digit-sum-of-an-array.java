class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sumLength = 0;
        int elementLength = 0;
        for(int i=0; i<n; i++){
            sumLength += nums[i];
            int N = nums[i];
            while(N>0){
                elementLength += N%10;
                N = N/10;
            }
        }
        return Math.abs(sumLength-elementLength);
    }
}