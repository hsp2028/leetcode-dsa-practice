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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int l = left;
        int r = right;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        if(head==null) return null;

        ListNode temp = head;
        ListNode leftPrev = dummy;
        int count = 1;
        while(count!=l){
            leftPrev = head;
            count++;
            head = head.next;
        }
        ListNode h = head;
        ListNode tail = null;
        while(count!=r){
            ListNode t = head.next;
            head.next = tail;
            tail = head;
            head = t;
            count++;
        }
        ListNode t = head.next;
        head.next = tail;
        tail = head;

        leftPrev.next = tail;
        
        h.next = t;

        return dummy.next;
        
    }
}