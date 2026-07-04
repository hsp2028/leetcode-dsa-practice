class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        
        int top = 0;
        int left = 0;
        int right =n-1;
        int bottom = n-1;
 
        int counter = 1;
        
        while(left<=right && top<=bottom){
            
            // left to right 
            for(int i=left; i<=right; i++){
               // m[top][i] = i+1;
               m[top][i] = counter++;
            }
            top++;
            
            // top to bottom 
           
            for(int i=top, j=0; i<=bottom; i++){
                // m[i][right] = m[top-1+j][right]+1;
                m[i][right] = counter++;
                j++;
            }
            right--;
            
            
            
            // right to left
            
            if(top<=bottom){
                for(int i=right,j=0; i>=left; i--){
                      
                    // m[bottom][i] = m[bottom][right+1-j]+1;
                    m[bottom][i] = counter++;
                    j++;
                 }
                 bottom--;
            }
            
            
            // bottom to top
             if(left<=right){
                for(int i=bottom,j=0; i>=top; i--){
                    
                    // m[i][left] = m[bottom+1-j][left]+1;
                    m[i][left] = counter++;
                    j++;
                 }
                 left++;
            }
        }
        return m;
    }
}