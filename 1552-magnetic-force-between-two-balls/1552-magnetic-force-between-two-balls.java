class Solution {
    private int numberOfBallsFit(int m, int[] arr){
        int ballsCount=1;
        int lastPosition = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-lastPosition>=m){
                ballsCount++;
                lastPosition = arr[i];
            }
        }
        return ballsCount;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int high = position[position.length-1]-position[0];
        int low = 1;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(numberOfBallsFit(mid, position)>=m){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}