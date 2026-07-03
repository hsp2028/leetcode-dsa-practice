class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> list = new ArrayList<>();
        if(n<m) return list;
        int[] hashP = new int[26];
        for (int i = 0; i < m; i++) {
            hashP[p.charAt(i) - 'a']++;
        }
        int i = 0;
        int j = 0;
        while (j < n) {
            j = i+m;
            int k = i;
            int[] hashS = new int[26];
            while (k < j) {
                hashS[s.charAt(k)-'a']++;
                k++;
            }
            boolean flag = true;
            for(int l=0; l<26; l++){
                if(hashP[l] != hashS[l]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}