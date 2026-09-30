class Solution {
    public int[] findDegrees(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==1){
                    ans[i]+=matrix[i][j];
                }
            }
        }
        return ans;
    }
}