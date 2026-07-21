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
    public ListNode rotateRight(ListNode head, int k) {
        
        // Bruteforce Solution
        // if(head==null || head.next==null){
        //     return head;
        // }
        
        // ListNode start = head;
        // ListNode temp = head;
        // int count = 0;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // k = k%count;
        // temp = head;
        // for(int i=0; i<k; i++){
        //     ListNode prev = null;
        //     while(temp.next != null){
        //         prev = temp;
        //         temp = temp.next;
        //     }
        //     temp.next = start;
        //     start = temp;
        //     prev.next = null;
        // }
        // return temp;

        // Optimal Solution

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        int count = 0;
        ListNode prev = null;
        while(temp != null){
            count++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
        k = k%count;
        int n = count-k;
        temp = prev;

        for(int i=0; i<n; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}