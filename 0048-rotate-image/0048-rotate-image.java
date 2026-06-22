class Solution {
    private void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    private void reverse(int[][] matrix, int i, int j){
        int n = matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n-1-j];
        matrix[i][n-1-j] = temp;
    }
    public void rotate(int[][] matrix) {

        // Bruteforce Solution => TC = O(n^2) and SC = O(n^2)
        // int n = matrix.length;
        // int[][] newM = new int[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         newM[i][j] = matrix[n-1-j][i];
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j] = newM[i][j];
        //     }
        // }

        // Optimal Solution
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(i==j){
                    continue;
                }
                swap(matrix, i, j);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                reverse(matrix, i, j);
            }
        }
    }
}