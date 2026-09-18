class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int num = start ^ goal;
        while(num!=0){
            int lsb = num&1;
            count+=lsb;
            num = num >> 1;
        }
        return count;
    }
}