class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n1 = name.length();
        int n2 = typed.length();
        if(n2<n1) return false;
        int i=0, j=0;
        while(i<n1 && j<n2){
            char c = name.charAt(i);
            if(c!=typed.charAt(j)) return false;
            int count1=0; 
            while(c==typed.charAt(j)){
                j++;
                count1++;
                if(j>=n2){
                    break;
                }
            }
            i++;
            int count2=0;
            while(i<n1 && name.charAt(i)==c){
                count2++;
                i++;
            }
            if(count1<count2+1) return false;
            if(i>=n1 && j<n2) return false;
            if(i<n1 && j>=n2) return false;
        }
        return true;
    }
}