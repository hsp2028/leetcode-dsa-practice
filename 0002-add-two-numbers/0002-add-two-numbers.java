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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Pass for some test cases
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ListNode temp1 = l1;
        // ListNode temp2 = l2;

        // while(temp1 != null){
        //     list1.add(temp1.val);
        //     temp1 = temp1.next;
        // }

        // while(temp2 != null){
        //     list2.add(temp2.val);
        //     temp2 = temp2.next;
        // }

        // BigInteger num1 = BigInteger.ZERO;
        // for(int i=0; i<list1.size(); i++){
        //     num1 = num1.multiply(BigInteger.valueOf(10));
        //     num1 = num1.add(BigInteger.valueOf(list1.get(i)));
        // }

        // BigInteger n1 = num1;
        // BigInteger newN1 = BigInteger.ZERO;
        // while(n1.compareTo(BigInteger.valueOf(0))>0){
        //     BigInteger digit = n1.mod(BigInteger.valueOf(10));
        //     newN1 = newN1.multiply(BigInteger.valueOf(10));
        //     newN1 = newN1.add(digit);
        //     n1 = n1.divide(BigInteger.valueOf(10));
        // }

        // BigInteger num2 = BigInteger.ZERO;
        // for(int i=0; i<list2.size(); i++){
        //     num2 = num2.multiply(BigInteger.valueOf(10));
        //     num2 = num2.add(BigInteger.valueOf(list2.get(i)));
        // }
        // BigInteger n2 = num2;
        // BigInteger newN2 = BigInteger.ZERO;
        // while(n2.compareTo(BigInteger.valueOf(0))>0){
        //     BigInteger digit = n2.mod(BigInteger.valueOf(10));
        //     newN2 = newN2.multiply(BigInteger.valueOf(10));
        //     newN2 = newN2.add(digit);
        //     n2 = n2.divide(BigInteger.valueOf(10));
        // }

        // BigInteger newN = newN1.add(newN2);
        // System.out.printf("newN1: %d, newN2: %d, newN: %d", newN1, newN2, newN);
        // ListNode newLL = new ListNode(0);
        // ListNode dummy = newLL;
        // if(newN.equals(BigInteger.ZERO)){
        //     return dummy;
        // }
        // while(newN.compareTo(BigInteger.ZERO)>0){
        //     BigInteger digit = newN.mod(BigInteger.valueOf(10));
        //     newLL.next = new ListNode(digit.intValue());
        //     newLL = newLL.next;
        //     newN = newN.divide(BigInteger.valueOf(10));
        // }
        // return dummy.next;

        // Solution

        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;

            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;

            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}