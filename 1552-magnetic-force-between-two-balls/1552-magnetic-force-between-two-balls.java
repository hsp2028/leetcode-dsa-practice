class Solution {
    private boolean numberOfBallsFit(int mid, int[] arr, int n){
        int ballsCount=1;
        int lastPosition = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-lastPosition>=mid){
                ballsCount++;
                lastPosition = arr[i];
                if(ballsCount>=n){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int high = (position[position.length-1]-position[0])/(m-1);
        int low = 1;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(numberOfBallsFit(mid, position, m)){
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