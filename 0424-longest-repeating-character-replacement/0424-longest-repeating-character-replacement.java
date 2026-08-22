class Solution {
    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        int i=0;
        int maxCount = 0;
        int maxLen = 0;
        int[] charA = new int[26];
        for(int j=0; j<n; j++){
            charA[str[j]-'A']++;
            maxCount = Math.max(maxCount, charA[str[j]-'A']);
            if((j-i+1)-maxCount>k){
                charA[str[i]-'A']--;
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}