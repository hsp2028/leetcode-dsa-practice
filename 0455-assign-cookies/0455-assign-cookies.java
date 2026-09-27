class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n1 = g.length;
        int n2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        if(n2==0) return 0;
        int j=0;
        int count=0;
        for(int i=0; i<n2; i++){
            if(g[j]<=s[i]){
                count++;
                j++;
            }
            if(j>=n1) break;
        }
        return count;
    }
}