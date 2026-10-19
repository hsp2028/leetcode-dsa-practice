class Solution {
    public String reversePrefix(String word, char ch) {
        char[] str = word.toCharArray();
        int n = str.length;
        int start = 0;
        for(int i=0; i<n; i++){
            if(str[i]==ch){
                int end = i;
                while(start<end){
                    char c = str[start];
                    str[start] = str[end];
                    str[end] = c;
                    start++;
                    end--;
                }
                return new String(str);
            }
        }
        return word;
    }
}