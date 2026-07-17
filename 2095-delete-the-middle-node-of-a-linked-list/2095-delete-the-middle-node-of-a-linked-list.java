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
    public ListNode deleteMiddle(ListNode head) {
        // Bruteforce Solution

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count==1){
            return null;
        }
        int idx = count/2;
        temp = head;
        ListNode prev = null;
        for(int i=0; i<idx; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;


        // Optimal Solution
        // ListNode fast = head;
        // ListNode slow = head;
        // ListNode prev = null;
        // while(fast!=null && fast.next != null){
        //     prev = slow;
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // if(prev==null){
        //     return null;
        // }
        // prev.next = slow.next;
        // return head;
    }
}