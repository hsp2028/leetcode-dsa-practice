class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }
        int time = 0;
        while(!q.isEmpty()){
            int currentPersonIndex = q.poll();
            tickets[currentPersonIndex]--;
            time++;
            if(currentPersonIndex==k && tickets[k]==0){
                return time;
            }

            if(tickets[currentPersonIndex]>0){
                q.add(currentPersonIndex);
            }
        }
        return time;
    }
}