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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = null;
        ListNode odd = null;
        ListNode evenTail = null;
        ListNode oddTail = null;

        ListNode temp = head;
        int count = 1;
        while(temp != null){
            if(count%2 != 0){
                if(odd == null){
                    odd = temp;
                    oddTail = temp;
                }
                else{
                    oddTail.next = temp; 
                    oddTail = temp;
                }
            }
            else{
                if(even == null){
                    even = temp;
                    evenTail = temp;
                }
                else{
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }
            temp = temp.next;
            count++;
        }
        if(even==null) return odd;
        if(odd==null) return even;

        oddTail.next = even;
        evenTail.next = null;

        return head;
    }
}