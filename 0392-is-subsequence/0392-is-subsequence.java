class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1==0) return true;
        if(n1>n2) return false;

        int j=0;
        for(int i=0; i<n2; i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            if(j>=n1){
                return true;
            }
        }
        return false;
    }
}