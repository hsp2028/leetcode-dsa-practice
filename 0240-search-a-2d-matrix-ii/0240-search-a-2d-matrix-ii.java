class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m-1, col = 0;
        while(row>=0 && col<n){
            int current = matrix[row][col];
            if(current == target){
                return true;
            }
            else if(current<target){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
}