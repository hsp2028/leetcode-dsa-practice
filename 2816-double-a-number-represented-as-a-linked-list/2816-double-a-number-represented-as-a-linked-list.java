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
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        // BigInteger num = BigInteger.ZERO;
        // ListNode temp = head;
        // if(head.val==0) return new ListNode();
        // while(temp!=null){
        //     num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(temp.val));
        //     temp = temp.next;
        // }
        // BigInteger doubleNum = num.multiply(BigInteger.valueOf(2));
        // ListNode newHead = null;
        // BigInteger N = doubleNum;
        // if(N.equals(BigInteger.valueOf(0))){
        //     return new ListNode(0);
        // }
        // while(N.compareTo(BigInteger.ZERO)>0){
        //     int digit = N.mod(BigInteger.valueOf(10)).intValue();
        //     ListNode newNode = new ListNode(digit);
        //     newNode.next = newHead;
        //     newHead = newNode;
        //     N = N.divide(BigInteger.valueOf(10));
        // }
        
        // return newHead;

        // Optimal Solution

        if(head.val>=5){
            head = new ListNode(0, head);
        }
        ListNode temp = head;
        while(temp!=null){
            temp.val = (temp.val*2)%10;
            if(temp.next!=null && temp.next.val>=5){
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }
}