class Solution {
    private int sumOfDivisionsBy(int divisor, int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += (long) (nums[i]+divisor-1)/divisor;
        }
        System.out.println();
        return count;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1, r=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(r<nums[i]){
                r = nums[i];
            }
        }
        int divisor = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println(mid);
            if(sumOfDivisionsBy(mid, nums)<=threshold){
                divisor = Math.min(mid, divisor);
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return divisor;
    }
}