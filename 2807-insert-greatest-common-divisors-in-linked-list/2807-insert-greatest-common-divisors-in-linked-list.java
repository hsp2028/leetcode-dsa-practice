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
    private int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = head.next;
        while(second!=null){
            int a = first.val;
            int b = second.val;
            // if(a>b){
            //     int gcd = findGCD(a, b);
            //     ListNode newNode = new ListNode(gcd, first.next);
            //     first.next = newNode;
            // } 
            // else{
            //     int gcd = findGCD(b, a);
            //     ListNode newNode = new ListNode(gcd, first.next);
            //     first.next = newNode;
            // }
            int gcd = findGCD(a, b);
            ListNode newNode = new ListNode(gcd, first.next);
            first.next = newNode;
            first = second;
            second = second.next;
        }
        return dummy.next;
    }
}