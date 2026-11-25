class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        for(int i=0; i<n; i++){
            int score1 = 0;
            for(int j=0; j<=i; j++){
                score1 += s.charAt(j)-'a'+1;
            }
            int score2 = 0;
            for(int k=i+1; k<n; k++){
                score2 += s.charAt(k)-'a'+1;
            }
            if(score1==score2){
                return true;
            }
        }
        return false;
    }
}