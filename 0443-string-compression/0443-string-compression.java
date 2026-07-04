class Solution {
    public int compress(char[] chars) {
        

        // Bruteforce Solution
        int idx = 0;
        for(int i=0; i<chars.length; i++){
            int count = 0;
            char ch = chars[i];
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            if(count == 1){
                chars[idx++] = ch;
            }
            else{
                chars[idx++] = ch;
                String str = String.valueOf(count);
                for(char digit : str.toCharArray()){
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        return idx;
    }
}