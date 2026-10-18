class Solution {
    public String truncateSentence(String s, int k) {
        // String[] str = s.split(" ");
        // StringBuffer ans = new StringBuffer();
        // for(int i=0; i<k; i++){
        //     ans.append(str[i]);
        //     if(i!=k-1){
        //         ans.append(" ");
        //     }
        // }
        // return ans.toString();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                k--;
            }
            if(k==0){
                return s.substring(0, i);
            }
        }
        return s;

        // String ans = "";
        // int count = 0;
        // int i = 0;
        // while(i<s.length() && count<k){
        //     if(s.charAt(i)==' '){
        //         count++;
        //     }
        //     if(count>=k){
        //         break;
        //     }
        //     ans += s.charAt(i);
        //     i++;
        // }
        // return ans;
    }
}