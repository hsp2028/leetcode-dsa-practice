/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Bruteforce Solution
        // ListNode temp1 = headA;
        // ListNode temp2 = headB;

        // while(temp1 != null){
        //     temp2 = headB;
        //     while(temp2 != null){
        //         if(temp1 == temp2 && temp2 != null){
        //             return temp2;
        //         }
        //         temp2 = temp2.next;
        //     }
        //     temp1 = temp1.next;
        // }
        // return null;

        // Better Solution (Using HashSet)

        HashSet<ListNode> set = new HashSet<>();

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}