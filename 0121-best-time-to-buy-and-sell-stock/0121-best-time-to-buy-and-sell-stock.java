class Solution {
    public int maxProfit(int[] prices) {

        // Time Limit Exceed Due to o(n^2)
        // int n = prices.length;
        // int[] profit = new int[n];
        // profit[n-1] = 0;
        // int max = Integer.MIN_VALUE;
        // int buy=0;

        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(max<(prices[j]-prices[i])){
        //             max = prices[j]-prices[i];
        //         }
        //     }
        //     profit[i] = max;
        // }
        // int max2 = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     if(max2<profit[i]){
        //         max2 = profit[i];
        //     }
        // }
        // return max2;


        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            if(min>prices[i]){
                min = prices[i];
            }

            int profit = prices[i] - min;

            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}