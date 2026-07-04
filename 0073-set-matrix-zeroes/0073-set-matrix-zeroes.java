class Solution {
    public void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length; 
        // int val = Integer.MIN_VALUE+5;
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == 0){
        //             for(int k=0; k<n; k++){
        //                 if(matrix[i][k] != 0){
        //                     matrix[i][k] = val;
        //                 }
        //             }
        //             for(int l=0; l<m; l++){
        //                 if(matrix[l][j] != 0){
        //                     matrix[l][j] = val;
        //                 }
        //             }
        //         }
        //     }
        // }
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == val){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // Better Solution

        // int m = matrix.length;
        // int n = matrix[0].length;
        // int[] row = new int[m];
        // Arrays.fill(row, -1);
        // int[] col = new int[n];
        // Arrays.fill(col, -1);
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = i;
        //             col[j] = j;
        //         }
        //     }
        // }
        // for(int i=0; i<m; i++){
        //     if(row[i] != -1){
        //         for(int j=0; j<n; j++){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     if(col[i] != -1){
        //         for(int j=0; j<m; j++){
        //             matrix[j][i] = 0;
        //         }
        //     }
        // }

        // Optimal Solution 

        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = -1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}