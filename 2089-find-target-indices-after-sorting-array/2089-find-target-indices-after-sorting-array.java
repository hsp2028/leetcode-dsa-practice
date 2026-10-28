class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // for(int n : nums){
        //     System.out.println(n);
        // }
        // List<Integer> ans = new ArrayList<>();
        // int i = 0;
        // int j = nums.length-1;
        // // while(i<=j){
        // //     int mid = i+(j-i)/2;
        // //     if(nums[mid]==target){
        // //         ans.add(mid);
        // //         if(mid<nums.length-1 && nums[mid+1]>target){
        // //             j = mid-1;
        // //         }
        // //         else{
        // //             i = mid+1;
        // //         }
        // //     }
        // //     else if(nums[mid]<target){
        // //         i = mid+1;
        // //     }
        // //     else{
        // //         j = mid-1;
        // //     }
        // // }
        // for(int k=0; k<nums.length; k++){
        //     if(nums[k]==target){
        //         ans.add(k);
        //     }
        // }
        // return ans;

        Arrays.sort(nums);
        int smallerCount = 0;
        int targetCount = 0;
        for(int n : nums){
            if(n<target){
                smallerCount++;
            }
            else if(n==target){
                targetCount++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<targetCount; i++){
            ans.add(smallerCount+i);
        }
        return ans;
    }
}