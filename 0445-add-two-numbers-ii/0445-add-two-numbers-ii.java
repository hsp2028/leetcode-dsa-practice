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
    private ListNode reverseLL(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode t = temp.next;
            temp.next = prev; 
            prev = temp;
            temp = t;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverseLL(l1);
        ListNode revL2 = reverseLL(l2);
        ListNode newLL = new ListNode(0);
        ListNode ans = newLL;
        int carry = 0;
        // while(revL1!=null && revL2!=null){
        //     int value = (revL1.val+revL2.val);
        //     newLL.next = new ListNode((value+carry)%10);
        //     carry = value/10;
        //     newLL = newLL.next;
        //     revL1 = revL1.next;
        //     revL2 = revL2.next;
        // }
        // if(carry!=0 && revL1==null && revL2==null){
        //     while(carry!=0){
        //         newLL.next = new ListNode(carry);
        //         newLL = newLL.next;
        //         carry = carry/10;
        //     }
        // }
        // if(revL1!=null){
        //     while(revL1!=null){
        //         newLL.next = new ListNode((revL1.val+carry)%10);
        //         revL1 = revL1.next;
        //         newLL = newLL.next;
        //     }
        // }
        // if(revL2!=null){
        //     while(revL2!=null){
        //         newLL.next = new ListNode((revL2.val+carry)%10);
        //         revL2 = revL2.next;
        //         newLL = newLL.next;
        //     }
        // }
        // ListNode finalAns = reverseLL(ans.next);
        // return finalAns;

        while(revL1!=null || revL2!=null || carry!=0){
            int sum = carry;
            if(revL1!=null){
                sum += revL1.val;
                revL1 = revL1.next;
            }
            if(revL2!=null){
                sum += revL2.val;
                revL2 = revL2.next;
            }
            carry = sum/10;
            newLL.next = new ListNode(sum%10);
            newLL = newLL.next;
        }
        return reverseLL(ans.next);
    }
}