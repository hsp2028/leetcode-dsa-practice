class Solution {
    public int maxDistinct(String s) {
        int n = s.length();
        // HashSet<Character> set = new HashSet<>();
        boolean[] visited = new boolean[256];
        int count = 0;
        for(int i=0; i<n; i++){
            if(!visited[s.charAt(i)]){
                visited[s.charAt(i)] = true;
                count++;
            }
        }
        return count;
    }
}