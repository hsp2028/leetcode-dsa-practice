class Solution {
    private void reverse(char[] a, int i, int j){
        while(i<j){
            char temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }
    private String cleanSpaces(char[] a, int n){
        int i = 0, j = 0;
        while(j<n){
            while(j<n && a[j] == ' '){
                j++;
            }
            if(j<n){
                int start = i;
                while(j<n && a[j] != ' '){
                    a[i++] = a[j++];
                }
                reverse(a, start, i-1);
                if(j<n){
                    a[i++] = ' ';
                }
            }
        }
        if(i>0 && a[i-1] == ' ') i--;
        return new String(a, 0, i);
    }
    public String reverseWords(String s) {
        
        // Better Solution
        // int n = s.length();
        // int i = n-1, j = n-1;
        // StringBuilder r = new StringBuilder();
        // while(j>=0){
        //     while(j>=0 && s.charAt(j) == ' '){
        //         j--;
        //     }
        //     if(j<0) break;
        //     i = j;
        //     while(j>=0 && s.charAt(j) != ' '){
        //         j--;
        //     }
        //     if(r.length()>0){
        //         r.append(' ');
        //     }
        //     r.append(s.substring(j+1, i+1));
        // }
        // return r.toString();

        // Optimal Solution

        char[] a = s.toCharArray();
        int n = a.length;

        reverse(a, 0, n-1);

        return cleanSpaces(a, n);
    }
}