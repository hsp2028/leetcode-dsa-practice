class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int left = i;
            int mid = (i+1)%n;
            int right = (i+2)%n;
            if(colors[mid]!=colors[right] && colors[mid]!=colors[left]){
                count++;
            }
        }
        return count;
    }
}