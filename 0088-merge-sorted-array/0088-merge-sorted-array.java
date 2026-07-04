class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=0;
        // int j=0;
        // int k=0;
        // int[] nums = new int[m+n];
        // while(i<m && j<n){
        //     if(nums1[i] <= nums2[j]){
        //         nums[k] = nums1[i];
        //         i++;
        //         k++;
        //     }
        //     else{
        //         nums[k] = nums2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // while(i<m){
        //     nums[k] = nums1[i];
        //     i++;
        //     k++;
        // }
        // while(j<n){
        //     nums[k] = nums2[j];
        //     j++;
        //     k++;
        // }
        // for(int l=0; l<m+n; l++){
        //     nums1[l] = nums[l];
        // }


        // Optimal Solution -> TC=>O(m+n) SC=>O(1)

        int p1 = m-1;
        int p2 = n-1;
        int k = m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[k--] = nums1[p1--];
            }
            else{
                nums1[k--] = nums2[p2--];
            }
        }
    }
}