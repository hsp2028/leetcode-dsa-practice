class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Bruteforce Solution: 
        // int s1 = s.length();
        // int s2 = t.length();
        // boolean flag=true;
        // if(s1 != s2){
        //     flag = false;
        //     return flag;
        // }
        // char[] char1 = s.toCharArray();
        // char[] char2 = t.toCharArray();
        // Arrays.sort(char1);
        // Arrays.sort(char2);
        // for(int i=0; i<s1; i++){
        //     if(char1[i] != char2[i]){
        //         flag = false;
        //         return flag;
        //     }
        // }
        // return flag;

        // Optimal Solution:

        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i<26; i++){
            freq[i] = 0;
        }
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        for(int i=0; i<t.length(); i++){
            int idx = t.charAt(i) - 'a';
            freq[idx]--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}