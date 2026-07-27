class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // Bruteforce Solution
        // int n = nums.length;
        // int[] res = new int[n];
        // Arrays.fill(res, -1);

        // for(int i=0; i<n; i++){
        //     int crrE = nums[i];
        //     for(int j=1; j<n; j++){
        //         int idx = (i+j)%n;
        //         if(nums[idx]>nums[i]){
        //             res[i] = nums[idx];
        //             break;
        //         }
        //     }
        // }
        // return res;

        // Optimal Solution 

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        int[] res = new int[n];
        for(int i=2*n-1; i>=0; i--){
            int idx = i%n;
            int currE = nums[idx];

            while(!stack.isEmpty() && stack.peek()<=currE){
                stack.pop();
            }

            if(i<n){
                if(stack.isEmpty()){
                    res[idx] = -1;
                }
                else{
                    res[idx] = stack.peek();
                }
            }
            stack.push(currE);
        }
        return res;
    }
}