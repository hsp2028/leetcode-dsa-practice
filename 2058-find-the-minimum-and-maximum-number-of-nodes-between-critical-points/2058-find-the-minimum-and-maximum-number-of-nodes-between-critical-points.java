/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Bruteforce Solution
        // if(head == null || head.next == null || head.next.next==null) return new int[]{-1, -1};
        // int[] ans = new int[2];
        // ListNode prev = head;
        // ListNode temp = prev.next;
        // List<Integer> critical = new ArrayList<>();
        // int count = 2;
        // while(temp.next!=null){
        //     if((temp.val>prev.val && temp.val>temp.next.val) || (temp.val<prev.val && temp.val<temp.next.val)){
        //         critical.add(count);
        //     }
        //     count++;
        //     prev = temp;
        //     temp = temp.next;
        // }
        // // System.out.println(critical);
        // if(critical.size()==0) return new int[]{-1, -1};
        // int maxDistance = critical.get(critical.size()-1)-critical.get(0);
        // int minDistance = Integer.MAX_VALUE;
        // for(int i=0; i<critical.size()-1; i++){
        //     minDistance = Math.min(minDistance, critical.get(i+1)-critical.get(i));
        // }
        // if(minDistance==Integer.MAX_VALUE) return new int[]{-1, -1};
        // ans[0] = minDistance;
        // ans[1] = maxDistance;
        // return ans;

        // Optimal Solution
        ListNode prev = head;
        ListNode temp = prev.next;
        int count = 2;
        int firstCritical = -1;
        int prevCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        while(temp.next!=null){
            boolean isMaxima = (temp.val>prev.val && temp.val>temp.next.val);
            boolean isMinima = (temp.val<prev.val && temp.val<temp.next.val);

            if(isMaxima || isMinima){
                if(firstCritical==-1){
                    firstCritical = count;
                    prevCritical = count;
                }
                else{
                    minDistance = Math.min(minDistance, count-prevCritical);
                    prevCritical = count;
                }
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(firstCritical==prevCritical){
            return new int[]{-1, -1};
        }
        int maxDistance = prevCritical-firstCritical;
        return new int[]{minDistance, maxDistance};
    }
}