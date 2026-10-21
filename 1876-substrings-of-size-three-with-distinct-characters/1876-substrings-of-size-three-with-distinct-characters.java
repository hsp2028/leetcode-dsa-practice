class Solution {
    public int countGoodSubstrings(String s) {
        // Bruteforce Solution
        // int n = s.length();
        // int count = 0;
        // for(int i=0; i<n-3+1; i++){
        //     HashSet<Character> set = new HashSet<>();
        //     int j=i+3;
        //     for(int k=i; k<j; k++){
        //         if(set.contains(s.charAt(k))){
        //             break;
        //         }
        //         set.add(s.charAt(k));
        //         if(k==j-1){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // Optimal Solution
        int n = s.length();
        int count = 0;
        int uniqueCount = 0;
        int[] charCount = new int[26];
        for(int i=0; i<n; i++){
            int addIdx = s.charAt(i)-'a';
            if(charCount[addIdx]==0){
                uniqueCount++;
            }
            charCount[addIdx]++;
            if(i>=2){
                if(uniqueCount==3){
                    count++;
                }
                int removeIdx = s.charAt(i-2)-'a';
                charCount[removeIdx]--;
                if(charCount[removeIdx]==0){
                    uniqueCount--;
                }
            }
        }
        return count;
    }
}