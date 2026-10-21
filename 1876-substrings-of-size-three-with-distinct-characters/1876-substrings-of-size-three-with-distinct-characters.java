class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0; i<n-3+1; i++){
            HashSet<Character> set = new HashSet<>();
            int j=i+3;
            for(int k=i; k<j; k++){
                if(set.contains(s.charAt(k))){
                    break;
                }
                set.add(s.charAt(k));
                if(k==j-1){
                    count++;
                }
            }
        }
        return count;
    }
}