class Solution {
    public boolean isPalindrome(String s) {
    
    // Bruteforce Solution
    //     boolean flag = false;
    //     String cleanS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
    //     String reversed = "";
    //     for(int i=cleanS.length()-1; i>=0; i--){
    //         reversed += cleanS.charAt(i);
    //     }
    //     if(cleanS.equals(reversed)){
    //         flag = true;
    //     }
    //     return flag;
    
    // Better Solution
        // String cleanAndReversed = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        // String reversed = new StringBuilder(cleanAndReversed).reverse().toString();
        // if(reversed.equals(cleanAndReversed)){
        //     return true;
        // }
        // return false;

    // Optimal Solution
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}