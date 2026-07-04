class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // int product=1;
        // int maxProduct = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     product *= nums[i];
        //     if(product>maxProduct){
        //         maxProduct = product;
        //     }
        //     if(product<0){
        //         product = 1;
        //     }
        // }
        // return maxProduct;
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1; 
        int suffix = 1;
        for(int i=0; i<n; i++){
            if(prefix==0){
                prefix = 1;
            }
            if(suffix==0){
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[n-i-1];
            // if(suffix>prefix && maxProduct<suffix){
            //     maxProduct=suffix;
            // }
            // if(prefix>suffix && maxProduct<prefix){
            //     maxProduct=prefix;
            // }
            // if(prefix==suffix && maxProduct<prefix){
            //     maxProduct=prefix;
            // }
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
}