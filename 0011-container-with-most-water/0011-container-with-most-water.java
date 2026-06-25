class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = Integer.MIN_VALUE;
        int i=0, j=n-1;
        while(i<j){
            int water = 0;
            if(height[i]<=height[j]){
                water = (j-i)*height[i];
                i++;
            }
            else{
                water = (j-i)*height[j];
                j--;
            }
            if(maxWater<water){
                maxWater = water;
            }
        }
        return maxWater;
    }
}