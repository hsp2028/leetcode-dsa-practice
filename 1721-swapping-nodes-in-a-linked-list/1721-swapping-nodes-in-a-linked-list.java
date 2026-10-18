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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1 = null;
        ListNode node2 = null;
        ListNode temp = head;
        int count = 1;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(count==k){
                node1 = temp;
            }
            if(count==n-k+1){
                node2 = temp;
            }
            temp = temp.next;
            count++;
        }
        int value = node1.val;
        node1.val = node2.val;
        node2.val = value;
        return head;
    }
}