class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans2 = new int[nums1.length];
        int[] ans = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    ans2[i] = ans[j];
                }
            }
        }
        return ans2;
    }
}