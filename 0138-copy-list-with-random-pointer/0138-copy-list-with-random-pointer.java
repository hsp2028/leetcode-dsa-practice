/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Node temp = head;
        // HashMap<Node, Node> map = new HashMap<>();
        // while(temp != null){
        //     Node newNode = new Node(temp.val);
        //     map.put(temp, newNode);
        //     temp = temp.next;
        // }
        // // Node dummy = new Node(-1);
        // temp = head;
        // while(temp != null){
        //     Node copyNode = map.get(temp);
        //     copyNode.next = map.get(temp.next);
        //     copyNode.random = map.get(temp.random);
        //     temp = temp.next;
        // }
        // return map.get(head);

        // More optimal solution

        Node temp = head;
        if(head == null){
            return head;
        }
        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        temp = head;
        while(temp != null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node dummy = new Node(-1);
        dummy.next = temp.next;
        Node res = dummy;
        while(temp != null){
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}