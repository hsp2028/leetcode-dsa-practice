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
    public ListNode detectCycle(ListNode head) {
        
        // Bruteforce Solution Using HashSet takes N(logN) time
        // HashSet<ListNode> set = new HashSet<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(temp.next == null){
        //         return null;
        //     }
        //     if(set.contains(temp)){
        //         return temp;
        //     }
        //     set.add(temp);
        //     temp = temp.next;
        // }
        // return null;

        // Optimal Solution Using Tortotoise and Hare

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}