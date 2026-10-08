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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode dS = dummy;
        ListNode dE = dummy;
        while(head!=null){
            if(head.val>dE.val){
                dE = head;
                head = head.next;
            }
            else{
                ListNode tS = dS;
                while(head.val>tS.next.val && tS!=dE){
                    tS = tS.next;
                }
                ListNode temp1 = tS.next;
                ListNode temp2 = head.next;
                tS.next = head;
                head.next = temp1;
                dE.next = temp2;
                head = dE.next;
            }
        }
        return dS.next;
    }
}