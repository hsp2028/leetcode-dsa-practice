class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        // StringBuffer ans = new StringBuffer();
        String ans = "";
        for(int i=0; i<k; i++){
            // ans.append(str[i]);
            ans += str[i];
            if(i!=k-1){
                // ans.append(" ");
                ans += " ";
            }
        }
        // return ans.toString();
        return ans;
    }
}