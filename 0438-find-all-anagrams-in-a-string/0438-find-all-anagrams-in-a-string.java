class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        // Bruteforce Solution -> TC = O(mn) and SC = O(1)
        // int n = s.length();
        // int m = p.length();
        // List<Integer> list = new ArrayList<>();
        // if(n<m) return list;
        // int[] hashP = new int[26];
        // for (int i = 0; i < m; i++) {
        //     hashP[p.charAt(i) - 'a']++;
        // }
        // int i = 0;
        // int j = 0;
        // while (j < n) {
        //     j = i+m;
        //     int k = i;
        //     int[] hashS = new int[26];
        //     while (k < j) {
        //         hashS[s.charAt(k)-'a']++;
        //         k++;
        //     }
        //     boolean flag = true;
        //     for(int l=0; l<26; l++){
        //         if(hashP[l] != hashS[l]){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         list.add(i);
        //     }
        //     i++;
        // }
        // return list;

        int n = s.length();
        int m = p.length();
        List<Integer> list = new ArrayList<>();
        if(n<m) return list;
        int[] hashP = new int[26];
        for(int i=0; i<m; i++){
            hashP[p.charAt(i)-'a']++;
        }
        int[] hashS = new int[26];
        for(int i=0; i<m; i++){
            hashS[s.charAt(i)-'a']++;
        }
        boolean flag1 = true;
        for(int i=0; i<26; i++){
            if(hashS[i]!=hashP[i]){
                flag1 = false;
                break;
            }
        }
        if(flag1){
            list.add(0);
        }
        for(int i=m; i<n; i++){
            hashS[s.charAt(i-m)-'a']--;
            hashS[s.charAt(i)-'a']++;
            boolean flag = true;
            for(int k=0; k<26; k++){
                if(hashS[k] != hashP[k]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i-m+1);
            }
        }
        return list;
    }
}