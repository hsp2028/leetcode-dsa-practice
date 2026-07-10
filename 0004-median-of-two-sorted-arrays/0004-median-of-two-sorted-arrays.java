class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[n+m];
        int i=0, j=0;
        int idx = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mergedArray[idx] = nums1[i];
                idx++;
                i++;
            }
            else{
                mergedArray[idx] = nums2[j];
                idx++;
                j++;
            }
        }
        if(i<m){
            while(i<m){
                mergedArray[idx] = nums1[i];
                i++;
                idx++;
            }
        }
        if(j<n){
            while(j<n){
                mergedArray[idx] = nums2[j];
                j++;
                idx++;
            }
        }
        double ans = 0;
        if((m+n)%2!=0){
            ans = mergedArray[(m+n)/2];
        }
        else{
            ans = (mergedArray[(m+n)/2]+mergedArray[((m+n)/2)-1])/2.0;
        }
        return ans;
    }
}