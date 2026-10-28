class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1<n2){
            getCommon(nums2, nums1);
        }
        System.out.println(n1);
        System.out.println(n2);
        int i = 0;
        int j = 0;
        while(j<n2 && i<n1){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}