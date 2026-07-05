class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int l = numbers.length, i1, i2;
        // for(int i=0; i<l; i++){
        //     for(int j=i+1; j<l; j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

        int n = numbers.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}