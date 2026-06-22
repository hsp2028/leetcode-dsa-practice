class Solution {
    private int findBound(int[] nums, int target, boolean isFirst){
        int i=0, j=nums.length-1;
        int bound = -1;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                bound = mid;
                if(isFirst){
                    j = mid-1;
                }
                else{
                    i = mid+1;
                }
            }
            else if(nums[mid]>target){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return bound;
    }
    public int[] searchRange(int[] nums, int target) {
        
        // Better Solution
        // int[] pos = new int[2];
        // int st = -1;
        // int lt = -1;
        // int i=0;
        // int j=nums.length-1;
        // while(i<=j){
        //     int mid = i+(j-i)/2;
        //     if(nums[mid] == target){
        //         st = mid;
        //         lt = mid;
        //         break;
        //     }
        //     else if(nums[mid]>target){
        //         j = mid-1;
        //     }
        //     else{
        //         i = mid+1;
        //     }
        // }
        // while(st>=0 && st != -1){
        //     if(nums[st] == target){
        //         st--;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // while(lt < nums.length && lt != -1){
        //     if(nums[lt] == target){
        //         lt++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // if(st != -1 || lt != -1){
        //     pos[0] = st+1;
        //     pos[1] = lt-1;
        //     return pos;
        // }
        // pos[0] = -1;
        // pos[1] = -1;
        // return pos;

        // Optimal Solution

        int left = findBound(nums, target, true);
        int right = findBound(nums, target, false);

        return new int[]{left, right};
    }
}