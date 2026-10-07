class Solution {
    public int maxDistinct(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<n; i++){
            if(!set.contains(s.charAt(i))){
                count++;
            }    
            set.add(s.charAt(i));
        }
        return count;
    }
}