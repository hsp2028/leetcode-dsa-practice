class Solution {
    private boolean contains(int[] mapS, int[] mapT){
        for(int i=0; i<mapS.length; i++){
            if(mapT[i]>mapS[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {

        // Better Solution
        // int[] mapS = new int[256];
        // int[] mapT = new int[256];
        // int left = 0, right = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        // for(char c : t.toCharArray()){
        //     mapT[c]++;
        // }
        // for(; right<s.length(); right++){
        //     mapS[s.charAt(right)]++;

        //     while(contains(mapS, mapT)){
        //         int len = right-left+1;
        //         if(len<minLen){
        //             minLen = len;
        //             minStart = left;
        //         }
        //         mapS[s.charAt(left++)]--;
        //     }
        // }
        // return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLen);

        // Optimal Solution
        int[] mapT = new int[128];
        for(char c : t.toCharArray()){
            mapT[c]++;
        }
        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = t.length();
        for(; right < s.length(); right++){
            char rightChar = s.charAt(right);
            if(mapT[rightChar]>0){
                count--;
            }
            mapT[rightChar]--;
            while(count == 0){
                int len = right-left+1;
                if(minLen>len){
                    minLen = len;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                mapT[leftChar]++;
                if(mapT[leftChar]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLen);
    }
}