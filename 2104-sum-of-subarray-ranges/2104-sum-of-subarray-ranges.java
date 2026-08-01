class Solution {
    public long subArrayRanges(int[] nums) {
        
        // Bruteforce Solution
        // int n = nums.length;
        // long rangeSum = 0;
        // for(int i=0; i<n; i++){
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     for(int j=i; j<n; j++){
        //         max = Math.max(max, nums[j]);
        //         min = Math.min(min, nums[j]);
        //         rangeSum += (long)(max-min);
        //     }
        // }
        // return rangeSum;

        // Optimal Solution
    //     int n = nums.length;
    //     int[] nse = findNSE(nums);
    //     int[] psee = findPSEE(nums);
    //     int[] nge = findNGE(nums);
    //     int[] pgee = findPGEE(nums);
    //     long minSum = 0;
    //     long maxSum = 0;
    //     for(int i=0; i<n; i++){
    //         int left = i-psee[i];
    //         int right = nse[i]-i;

    //         long freq = left*right*1L;
    //         minSum += freq*nums[i];
    //     }
    //     for(int i=0; i<n; i++){
    //         int left = i-pgee[i];
    //         int right = nge[i]-i;
    //         long freq = left*right*1L;
    //         maxSum += freq*nums[i];
    //     }
    //     return (maxSum-minSum);

        // More optimal solution
        int n = nums.length;
        int[] stack = new int[n+1];
        long totalSum = 0;

        int top = -1;
        for(int i = 0; i<=n; i++){
            while(top>=0 && (i==n || nums[stack[top]] < nums[i])){
                int currIdx = stack[top--];
                int leftBoundry = top>=0?stack[top]:-1;
                long count = (long) (currIdx-leftBoundry) * (i-currIdx);
                totalSum += count*nums[currIdx];
            }
            stack[++top] = i;
        }

        top = -1;
        for(int i = 0; i<=n; i++){
            while(top>=0 && (i==n || nums[stack[top]] > nums[i])){
                int currIdx = stack[top--];
                int leftBoundry = top>=0?stack[top]:-1;
                long count = (long) (currIdx-leftBoundry) * (i-currIdx);
                totalSum -= count*nums[currIdx];
            }
            stack[++top] = i;
        }
        return totalSum;
    }
    // private int[] findNSE(int[] nums){
    //     int n = nums.length;
    //     Stack<Integer> stack = new Stack<>();
    //     int[] res = new int[n];
    //     for(int i=n-1; i>=0; i--){
    //         while(!stack.isEmpty() && nums[i]<=nums[stack.peek()]){
    //             stack.pop();
    //         }
    //         res[i] = !stack.isEmpty()?stack.peek():n;
    //         stack.push(i);
    //     }
    //     return res;
    // }
    // private int[] findPSEE(int[] nums){
    //     int n = nums.length;
    //     Stack<Integer> stack = new Stack<>();
    //     int[] res = new int[n];
    //     for(int i=0; i<n; i++){
    //         while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
    //             stack.pop();
    //         }
    //         res[i] = !stack.isEmpty()?stack.peek():-1;
    //         stack.push(i);
    //     }
    //     return res;
    // }
    // private int[] findNGE(int[] nums){
    //     int n = nums.length;
    //     Stack<Integer> stack = new Stack<>();
    //     int[] res = new int[n];
    //     for(int i=n-1; i>=0; i--){
    //         while(!stack.isEmpty() && nums[i]>=nums[stack.peek()]){
    //             stack.pop();
    //         }
    //         res[i] = !stack.isEmpty()?stack.peek():n;
    //         stack.push(i);
    //     }
    //     return res;
    // }
    // private int[] findPGEE(int[] nums){
    //     int n = nums.length;
    //     Stack<Integer> stack = new Stack<>();
    //     int[] res = new int[n];
    //     for(int i=0; i<n; i++){
    //         while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
    //             stack.pop();
    //         }
    //         res[i] = !stack.isEmpty()?stack.peek():-1;
    //         stack.push(i);
    //     }
    //     return res;
    // }
}