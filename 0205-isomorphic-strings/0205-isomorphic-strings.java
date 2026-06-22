class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // Bruteforce Solution
        // if(s.length() != t.length()){
        //     return false;
        // }
        // HashMap<Character, Character> map = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     char sChar = s.charAt(i);
        //     char tChar = t.charAt(i);

        //     if(!map.containsKey(sChar)){
        //         if(!map.containsValue(tChar)){
        //             map.put(sChar, tChar);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         char mappedCharacter = map.get(sChar);
        //         if(mappedCharacter != tChar){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        // Optimal Solution

        if(s.length() != t.length()){
            return false;
        }
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap[sChar] != tMap[tChar]){
                return false;
            }
            sMap[sChar] = i+1;
            tMap[tChar] = i+1;
        }
        return true;
    }
}