class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Bruteforce Solution: TLE Problem arises: 

        // List<List<String>> l2 = new ArrayList<>();
        // boolean[] visited = new boolean[strs.length];
        // for(int i=0; i<strs.length; i++){
        //     if(visited[i]){
        //         continue;
        //     }
        //     char[] char1 = strs[i].toCharArray();
        //     Arrays.sort(char1);
        //     List<String> l1 = new ArrayList<>();
        //     for(int j=0; j<strs.length; j++){
        //         if(visited[j]){
        //             continue;
        //         }
        //         char[] char2 = strs[j].toCharArray();
        //         Arrays.sort(char2);
        //         if(char1.length != char2.length){
        //             continue;
        //         }
        //         boolean flag = true;
        //         for(int k=0; k<char1.length; k++){
        //             if(char1[k] != char2[k]){
        //                 flag = false;
        //             }
        //         }
        //         if(flag){
        //             l1.add(strs[j]);
        //             visited[j] = true;
        //         }
        //     }
        //     l2.add(l1);
        // }
        // return l2;

        // Better Solution: Categorized by frequency of string

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String freqStr = getFreqStr(str);

            if(map.containsKey(freqStr)){
                map.get(freqStr).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(freqStr, strList);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String getFreqStr(String str){
        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder freqStr = new StringBuilder("");

        char c = 'a';
        for(int i:freq){
            freqStr.append(c);
            freqStr.append(i);
            c++;
        }
        return freqStr.toString();
    }
}