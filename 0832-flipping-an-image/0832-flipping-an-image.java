class Solution {
    public void reverseRow(int[][] image, int i){
        int n = image[0].length;
        for(int j=0; j<n/2; j++){
            int temp = image[i][j];
            image[i][j] = image[i][n-1-j];
            image[i][n-1-j] = temp;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        for(int i=0; i<m; i++){
            reverseRow(image, i);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(image[i][j]==0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}