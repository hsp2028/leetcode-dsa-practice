class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] str = s.toCharArray();

        for(int i=0; i<n; i+=2*k){
            int start = i;
            int end = Math.min(i+k-1, n-1);
            while(start<end){
                char c = str[start];
                str[start] = str[end];
                str[end] = c;
                start++;
                end--;
            }
        }
        return new String(str);
    }
}