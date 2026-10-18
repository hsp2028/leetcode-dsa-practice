class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<k; i++){
            ans.append(str[i]);
            if(i!=k-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}