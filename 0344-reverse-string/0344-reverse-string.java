class Solution {
    private void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            swap(s, i, s.length-i-1);
        }
    }
}