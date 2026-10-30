class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            charCount[ch-'a']++;
            q.offer(i);
            while(!q.isEmpty() && charCount[s.charAt(q.peek())-'a']>1){
                q.poll();
            }
        }
        return q.isEmpty() ? -1 : q.peek();
    }
}