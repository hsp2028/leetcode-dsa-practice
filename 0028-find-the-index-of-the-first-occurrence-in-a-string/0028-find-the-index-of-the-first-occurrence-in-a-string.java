class Solution {
    public int strStr(String haystack, String needle) {
        
        // Bruteforce Solution
        // int j = 0;
        // int i = 0;
        // int idx = -1;
        // if(needle.length() == 0) return 0;
        // while(j < needle.length() && i < haystack.length()){
        //     if(haystack.charAt(i) == needle.charAt(j)){
        //         if(j==0){
        //             idx = i;
        //         }
        //         i++;
        //         j++;
        //     }
        //     else{
        //         i = i-j+1;
        //         idx = -1;
        //         j=0;
        //     }
        // }
        // if(j==needle.length()){
        //     return idx;
        // }
        // return -1;

        // Better Solution

        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}