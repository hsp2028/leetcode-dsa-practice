class Solution {
    public int totalFruit(int[] fruits) {
        
        // Bruteforce TLE Problem
        // int n = fruits.length;
        // int maxLen = 0;
        // for(int i=0; i<n; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j=i; j<n; j++){
        //         set.add(fruits[j]);
        //         if(set.size()<=2){
        //             maxLen = Math.max(maxLen, j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;

        // Better Solution

        // int maxLen = 0;
        // int n = fruits.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int l=0, r=0; r<n; r++){
        //     map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);
        //     if(map.size()<=2){
        //         maxLen = Math.max(maxLen, r-l+1);
        //     }
        //     else{
        //         while(map.size()>2){
        //             map.put(fruits[l], map.get(fruits[l])-1);
        //             if(map.get(fruits[l])==0) map.remove(fruits[l]);
        //             l++;
        //         }
        //     }
        // }
        // return maxLen;

        // Optimal Solution
        
        int n = fruits.length;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int l=0, r=0; r<n; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);
            if(map.size()<=2){
                maxLen = Math.max(maxLen, r-l+1);
            }
            else{
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }
        }
        return maxLen;
    }
}