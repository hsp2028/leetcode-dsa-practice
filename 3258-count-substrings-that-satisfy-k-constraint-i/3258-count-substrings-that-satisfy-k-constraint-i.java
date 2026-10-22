class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int zero = 0;
        int one = 0;
        int totalSubstrings = 0;
        int j = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            if(s.charAt(i)=='1'){
                one++;
            }
            while(zero>k && one>k){
                if(s.charAt(j)=='0'){
                    zero--;
                }
                else{
                    one--;
                }
                j++;
            }
            totalSubstrings += (i-j+1);
        }
        return totalSubstrings;
    }
}