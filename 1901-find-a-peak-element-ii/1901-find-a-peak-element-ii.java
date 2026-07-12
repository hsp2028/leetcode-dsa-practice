class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = mat[0].length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            int maxE = Integer.MIN_VALUE;
            int maxR = -1;
            for(int i=0; i<m; i++){
                if(mat[i][mid]>maxE){
                    maxE = mat[i][mid];
                    maxR = i;
                }
            }
            int leftE = (mid-1 >= 0) ? mat[maxR][mid-1] : -1;
            int rightE = (mid+1 < n) ? mat[maxR][mid+1] : -1;
            if(mat[maxR][mid] > leftE && mat[maxR][mid] > rightE){
                return new int[] {maxR, mid};
            }
            else if(mat[maxR][mid]<leftE){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[] {-1, -1};
    }
}