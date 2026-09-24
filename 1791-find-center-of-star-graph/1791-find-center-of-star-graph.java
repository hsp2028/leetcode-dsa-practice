class Solution {
    public int findCenter(int[][] edges) {
        int m = edges.length;
        int n = edges[0].length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(set.contains(edges[i][j])){
                    return edges[i][j];
                }
                set.add(edges[i][j]);
            }
        }
        return 0;
    }
}