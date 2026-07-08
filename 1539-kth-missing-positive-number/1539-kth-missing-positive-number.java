class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int missing = arr[mid]-(mid+1);
            if(missing>=k){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        // return arr[j]+k-(arr[j]-(j+1));
        return k+j+1;
    }
}