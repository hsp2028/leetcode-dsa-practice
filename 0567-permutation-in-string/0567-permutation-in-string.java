class Solution {
    boolean isSame(int[] arr, int[] arr1){
        for(int i=0; i<26; i++){
            if(arr[i] != arr1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m<n) return false;
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int k=0; k<m-n+1; k++){
            int i = k+n;
            int[] arr1 = new int[26];
            for(int j=k; j<i; j++){
                arr1[s2.charAt(j)-'a']++;
            }
            if(isSame(arr, arr1)){
                return true;
            }
        }
        return false;
    }
}