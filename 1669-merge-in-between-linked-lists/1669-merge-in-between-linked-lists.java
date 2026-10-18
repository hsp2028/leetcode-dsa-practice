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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode bthNode = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        ListNode prev = null;
        int count = 0;
        while(count != a){
            prev = temp1;
            temp1 = temp1.next;
            count++;
        }
        prev.next = list2;
        while(count != b){
            temp1 = temp1.next;
            count++;
        }
        temp2.next = temp1.next;
        return list1;
    }
}