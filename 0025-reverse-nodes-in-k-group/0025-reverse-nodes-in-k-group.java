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
    public ListNode getKthNode(ListNode curr, int k){
        
        while(curr != null && k>0){
            curr = curr.next;
            k--;
        }
        
        return curr;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while(true){
            ListNode Kth = getKthNode(groupPrev, k);
            if(Kth == null) break;

            ListNode groupNext = Kth.next;
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;
            for(int i=0; i<k; i++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp; 
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = Kth;
            groupPrev = temp;
        }
        return dummy.next;
    }
}