class Solution {
    public int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num);
        int n = numStr.length();
        int count = 0;
        for(int i=0; i<n-k+1; i++){
            int j = i+k;
            int subNum = Integer.valueOf(numStr.substring(i, j));
            if(subNum!=0 && num%subNum==0){
                count++;
            }
        }
        return count;
    }
}