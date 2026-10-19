class Solution {
    private boolean isPalindrome(String s){
        int n = s.length();
        int i=0, j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i=0; i<n; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}