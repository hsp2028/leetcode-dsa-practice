class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        int i=0;
        int j=len-1;
        char[] str = s.toCharArray();
        while(str[i]==str[j] && i<j){
            char c = str[i];
            while(str[i]==c && i<len-1){
                i++;
            }
            while(str[j]==c && j>0){
                j--;
            }
        }
        int minLength = j-i+1;
        if(minLength<=0){
            return 0;
        }
        return j-i+1;
    }
}