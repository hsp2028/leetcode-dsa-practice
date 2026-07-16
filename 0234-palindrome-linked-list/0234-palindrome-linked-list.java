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
    
    public boolean isPalindrome(ListNode head) {
    // Bruteforce Solution
    //     Stack<Integer> stack = new Stack<>();
    //     ListNode temp = head;
    //     while(temp != null){
    //         stack.push(temp.val);
    //         temp = temp.next;
    //     } 

    //     temp = head;
    //     while(temp != null){
    //         if(temp.val != stack.pop()){
    //             return false;
    //         }
    //         temp = temp.next;
    //     }
    //     return true;


        // Optimal Solution
        if(head == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        slow = prev;
        ListNode temp = head;
        while(slow != null && temp != null){
            if(temp.val != slow.val){
                return false;
            }
            temp = temp.next;
            slow = slow.next;
        }
        return true;
    }
}