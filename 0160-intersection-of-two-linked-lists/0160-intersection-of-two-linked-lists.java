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
        int count1 = 0;
        int count2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        // while(temp1 != null){
        //     count1++;
        //     temp1 = temp1.next;
        // }
        // while(temp2 != null){
        //     count2++;
        //     temp2 = temp2.next;
        // }
        // if(count1>count2){
        //     getIntersectionNode(headB, headA);
        // }

        // temp1 = headA;
        // temp2 = headB;

        while(temp1 != null){
            temp2 = headB;
            while(temp2 != null){
                if(temp1 == temp2 && temp2 != null){
                    return temp2;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }
}