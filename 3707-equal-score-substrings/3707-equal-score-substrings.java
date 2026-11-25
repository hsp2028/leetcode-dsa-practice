class Solution {
    public boolean scoreBalance(String s) {
        // Bruteforce Solution
        // int n = s.length();
        // for(int i=0; i<n; i++){
        //     int score1 = 0;
        //     for(int j=0; j<=i; j++){
        //         score1 += s.charAt(j)-'a'+1;
        //     }
        //     int score2 = 0;
        //     for(int k=i+1; k<n; k++){
        //         score2 += s.charAt(k)-'a'+1;
        //     }
        //     if(score1==score2){
        //         return true;
        //     }
        // }
        // return false;

        // PrefixSum 

        int n = s.length();
        int[] prefixSum = new int[n];
        prefixSum[0] = s.charAt(0)-'a'+1;
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1]+s.charAt(i)-'a'+1;
        }
        int total = prefixSum[n-1];
        for(int i=0; i<n; i++){
            if(prefixSum[i]==total-prefixSum[i]){
                return true;
            }
        }
        return false;
    }
}