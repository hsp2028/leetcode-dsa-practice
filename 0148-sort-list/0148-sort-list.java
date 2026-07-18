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
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val>l2.val){
                curr.next = l2;
                l2 = l2.next;
            }
            else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        
        // Bruteforce
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode temp = head;
        // while(temp != null){
        //     ListNode temp2 = temp.next;
        //     while(temp2 != null){
        //         if(temp.val>temp2.val){
        //             int n = temp.val;
        //             temp.val = temp2.val;
        //             temp2.val = n;
        //         }
        //         temp2 = temp2.next;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        // Better Solution

        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        temp = head;
        Collections.sort(list);
        int i = 0;
        while(temp != null){
            temp.val = list.get(i);
            i++;
            temp = temp.next;
        }

        return head;
        // Optimal Solution
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode fast = head;
        // ListNode slow = head;
        // ListNode prev = null;
        // while(fast != null && fast.next != null){
        //     prev = slow;
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // prev.next = null;

        // ListNode l1 = sortList(head);
        // ListNode l2 = sortList(slow);

        // return merge(l1, l2);
    }
}