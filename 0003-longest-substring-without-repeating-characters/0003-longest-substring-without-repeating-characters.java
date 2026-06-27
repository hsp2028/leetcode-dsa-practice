class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Bruteforce solution

        // int n = s.length();
        // int maxLen = 0;
        // for(int i=0; i<n; i++){
        //     int[] hash = new int[256];
        //     for(int j=i; j<n; j++){
        //         if(hash[s.charAt(j)] == 1){
        //             break;
        //         }
        //         int len = j-i+1;
        //         maxLen = Math.max(len, maxLen);
        //         hash[s.charAt(j)] = 1;
        //     }
        // }
        // return maxLen;

        // Optimal Solution
        int n = s.length();
        int[] ch = new int[256];
        for(int i=0; i<256; i++){
            ch[i] = -1;
        }
        int l=0, r=0;
        int maxLen = 0;
        while(r<n){
            if(ch[s.charAt(r)] != -1){
                if(ch[s.charAt(r)] >= l){
                    l = ch[s.charAt(r)] + 1;
                }
            }
            int len = r-l+1;
            maxLen = Math.max(len, maxLen);
            ch[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}