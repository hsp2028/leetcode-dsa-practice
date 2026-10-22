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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode prev = head;
        int expectedSize = 2;
        while(prev.next != null){
            ListNode curr = prev.next;
            int actualLength = 0;

            while(curr!=null && actualLength<expectedSize){
                actualLength++;
                curr = curr.next;
            }

            if(actualLength%2==0){
                ListNode reverseHead = prev.next;
                ListNode reversePrev = null;
                for(int i=0; i<actualLength; i++){
                    ListNode nextNode = reverseHead.next;
                    reverseHead.next = reversePrev;
                    reversePrev = reverseHead;
                    reverseHead = nextNode;
                }
                ListNode groupTail = prev.next;
                prev.next = reversePrev;
                groupTail.next = reverseHead;
                prev = groupTail;
            }
            else{
                for(int i=0; i<actualLength; i++){
                    prev = prev.next;
                }
            }
            expectedSize++;
        }
        return head;
    }
}