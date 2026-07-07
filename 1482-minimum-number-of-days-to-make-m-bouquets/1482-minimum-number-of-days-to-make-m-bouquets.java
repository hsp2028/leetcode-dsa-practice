class Solution {
    private int numberOfBouqutes(int[] arr,int day, int k){
        int count = 0;
        int flower = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day){
                flower++;
                if(flower==k){
                    count++;
                    flower=0;
                }
            }
            else{
                flower=0;
            }
        }
        return count;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k){
            return -1;
        }
        int maxD = Integer.MIN_VALUE;
        int minD = Integer.MAX_VALUE;
        int minDay = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            // minD = Math.min(minD, bloomDay[i]);
            if(minD>bloomDay[i]){
                minD = bloomDay[i];
            }
            if(maxD<bloomDay[i]){
                maxD = bloomDay[i];
            }
        }
        int i=minD, j=maxD;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(numberOfBouqutes(bloomDay, mid, k)>=m){
                minDay = mid;
                j=mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return minDay;
    }
}