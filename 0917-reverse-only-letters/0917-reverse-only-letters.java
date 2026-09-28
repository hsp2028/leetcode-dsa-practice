class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] str = s.toCharArray();
        int j=n-1;
        int i=0;
        while(i<=j){
            if(Character.isLetter(str[i])){
                if(Character.isLetter(str[j])){
                    char t = str[j];
                    str[j] = str[i];
                    str[i] = t;
                    i++;
                }
                j--;
            }
            else{
                i++;
            }
        }
        return new String(str);
    }
}