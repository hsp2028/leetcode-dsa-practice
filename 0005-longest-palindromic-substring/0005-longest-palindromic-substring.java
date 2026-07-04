class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==0) return "";
        String LPS = s.substring(0,1);

        for(int i=0; i<n; i++){
            int low = i;
            int high = i;
            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }   
            low = i;
            high = i+1;
            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
    }
}