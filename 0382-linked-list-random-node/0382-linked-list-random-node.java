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
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        ListNode temp = head;
        List<ListNode> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */