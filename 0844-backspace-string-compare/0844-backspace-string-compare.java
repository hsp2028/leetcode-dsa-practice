class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        int hashCount = 0;
        String str1 = "";
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == 35){
                hashCount++;
                continue;
            }
            if(hashCount == 0){
                str1 = s.charAt(i)+str1;
            }
            else{
                hashCount--;
            }
        }
        hashCount = 0;
        String str2 = "";
        for(int i=m-1; i>=0; i--){
            if(t.charAt(i)==35){
                hashCount++;
                continue;
            }
            if(hashCount==0){
                str2 = t.charAt(i)+str2;
            }
            else{
                hashCount--;
            }
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}