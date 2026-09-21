class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // int n = s.length();

        // int i=0; 
        // int j=i+9;
        // List<String> list = new ArrayList<>();
        // if(n<10) return list;
        // Set<String> set = new HashSet<>();
        // while(j<n){
        //     String str = s.substring(i, j+1);

        //     int k=0;
        //     int l=9+k;
        //     int count=0;
        //     while(l<n){
        //         String str2 = s.substring(k, l+1);
        //         if(str.equals(str2)){
        //             count++;
        //         }
        //         k++;
        //         l++;
        //     }
        //     if(count>1){
        //         set.add(str);
        //     }
        //     i++;
        //     j++;
        // }
        // return new ArrayList<>(set);

        // Optimal solution (HashSet+Sliding window)

        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for(int i=0; i<=s.length()-10; i++){
            String str = s.substring(i, i+10);

            if(!seen.add(str)){
                repeated.add(str);
            }
        }

        return new ArrayList<>(repeated);
    }
}