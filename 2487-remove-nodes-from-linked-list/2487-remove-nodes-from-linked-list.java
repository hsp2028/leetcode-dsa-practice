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
    private ListNode reversedList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        
        ListNode reversedHead = reversedList(head);
        ListNode curr = reversedHead;
        int maxVal = curr.val;
        while(curr!=null && curr.next!=null){
            if(maxVal>curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                maxVal = curr.next.val;
                curr = curr.next;
            }
        }
        return reversedList(reversedHead);
    }
}