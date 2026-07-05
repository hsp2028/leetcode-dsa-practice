class Solution {
    // private String getActual(String str){
    //     int n = str.length();
    //     StringBuilder sb = new StringBuilder();
    //     int hashCount = 0;
    //     for(int i=n-1; i>=0; i--){
    //         if(str.charAt(i)=='#'){
    //             hashCount++;
    //             continue;
    //         }
    //         if(hashCount == 0){
    //             sb.insert(0, str.charAt(i));
    //         }
    //         else{
    //             hashCount--;
    //         }
    //     }
    //     return sb.toString();
    // }
    public boolean backspaceCompare(String s, String t) {

        // Better Solution

        // return getActual(s).equals(getActual(t));
        // int n = s.length();
        // int m = t.length();
        

        // Bruteforce Solution
        // int hashCount = 0;
        // String str1 = "";
        // for(int i=n-1; i>=0; i--){
        //     if(s.charAt(i) == 35){
        //         hashCount++;
        //         continue;
        //     }
        //     if(hashCount == 0){
        //         str1 = s.charAt(i)+str1;
        //     }
        //     else{
        //         hashCount--;
        //     }
        // }
        // hashCount = 0;
        // String str2 = "";
        // for(int i=m-1; i>=0; i--){
        //     if(t.charAt(i)==35){
        //         hashCount++;
        //         continue;
        //     }
        //     if(hashCount==0){
        //         str2 = t.charAt(i)+str2;
        //     }
        //     else{
        //         hashCount--;
        //     }
        // }
        // if(str1.equals(str2)){
        //     return true;
        // }
        // return false;

        // Optimal Solution

        int i=s.length()-1, j=t.length()-1;
        int skipS=0, skipT=0;
        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }
                else if(skipS>0){
                    skipS--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipT++;
                    j--;
                }
                else if(skipT>0){
                    skipT--;
                    j--;
                }
                else{
                    break;
                }
            }

            if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)){
                return false;
            }
            if((i>=0) != (j>=0)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}