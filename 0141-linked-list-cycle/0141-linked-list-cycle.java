/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Using Hashset Bruteforce Solution
        // HashSet<ListNode> set = new HashSet<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(temp.next == null){
        //         return false;
        //     }
        //     if(set.contains(temp)){
        //         return true;
        //     }
        //     set.add(temp);
        //     temp = temp.next;
        // }
        // return false;

        // Optimal Solution -> Using Tortotoise and Hare Algorithm (Floyd's Cycle)

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}