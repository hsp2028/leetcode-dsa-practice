class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = Integer.MIN_VALUE;
        int i=0, j=n-1;
        while(i<j){
            int water = (j-i) * Math.min(height[i], height[j]);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
            if(maxWater<water){
                maxWater = water;
            }
        }
        return maxWater;
    }
}