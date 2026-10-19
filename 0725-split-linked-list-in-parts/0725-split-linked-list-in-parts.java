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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int width = size/k;
        int extra = size%k;
        for(int i=0; i<k; i++){
            if(temp == null){
                break;
            }
            ans[i] = temp;
            int currentPartSize = width+(i<extra?1:0);
            ListNode prev = null;
            for(int j=0; j<currentPartSize; j++){
                prev = temp;
                temp = temp.next;
            }
            if(prev!=null){
                prev.next = null;
            }
        }
        return ans;
    }
}