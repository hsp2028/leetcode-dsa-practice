class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lowR = 0, highR = m-1;
        int lowC = 0, highC = n-1;
        while(highR>=lowR){
            int midR = lowR+(highR-lowR)/2;
            if(target >= matrix[midR][lowC] && target<=matrix[midR][highC]){
                int mid = lowC+(highC-lowC)/2;
                if(matrix[midR][mid] == target){
                    return true;
                }
                else if(target>matrix[midR][mid]){
                    lowC = mid+1;
                }
                else{
                    highC = mid-1;
                }
            }
            else if(target>matrix[midR][highC]){
                lowR = midR+1;
            }
            else{
                highR = midR-1;
            }
        }
        return false;

        // int m = matrix.length;
        // int n = matrix[0].length;
        // int low=0, high=(m*n)-1;
        // while(low<=high){
        //     int mid = low+(high-low)/2;
        //     int row = mid/n;
        //     int col = mid%n;
        //     int element = matrix[row][col];
        //     if(element == target){
        //         return true;
        //     }
        //     else if(target>element){
        //         low = mid+1;
        //     }
        //     else{
        //         high = mid-1;
        //     }
        // }
        // return false;
    }
}