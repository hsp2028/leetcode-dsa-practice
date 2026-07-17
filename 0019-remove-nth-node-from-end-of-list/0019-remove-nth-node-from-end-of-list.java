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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Bruteforce Solution

        ListNode temp = head;
        int l = 0;
        while(temp != null){
            l++;
            temp = temp.next;
        }
        if(l==1){
            return null;
        }
        if(l==n){
            return head.next;
        }
        int resNode = l-n+1;
        ListNode prev = null;
        temp = head;
        for(int i=0; i<resNode-1; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}