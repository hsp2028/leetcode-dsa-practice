class FrontMiddleBackQueue {
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private Node curr;
    private int size;
    public FrontMiddleBackQueue() {
        this.curr = null;
        this.size = 0;
    }
    
    public void pushFront(int val) {
        Node front = new Node(val);
        front.next = curr;
        curr = front;
        size++;
        
    }
    
    public void pushMiddle(int val) {
        if(size==0){
            pushFront(val);
            return;
        }
        Node slow = curr;
        Node prev = null;
        int minIdx = size/2;
        for(int i=0; i<minIdx; i++){
            prev = slow;
            slow = slow.next;
        }
        Node middle = new Node(val);
        if(prev==null){
            middle.next = curr;
            curr = middle;
        }
        else{
            prev.next = middle;
            middle.next = slow;
        }
        size++;
    }
    
    public void pushBack(int val) {
        if(curr==null){
            pushFront(val);
            return;
        }
        Node temp = curr;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node back = new Node(val);
        temp.next = back;
        size++;
    }
    
    public int popFront() {
        if(curr==null){
            return -1;
        }
        int ans = curr.val;
        curr = curr.next;
        size--;
        return ans;
    }
    
    public int popMiddle() {
        if(curr==null) return -1;
        if(curr.next==null) return popFront();
       
        Node slow = curr;
        Node prev = null;
        int target = (size-1)/2;
        for(int i=0; i<target; i++){
            prev = slow;
            slow = slow.next;
        }
        int ans;
        if(prev==null){
            ans = curr.val;
            curr = curr.next;
        }
        else{
            Node t = prev.next;
            ans = t.val;
            prev.next = t.next;
        }
        size--;
        return ans;
    }
    
    public int popBack() {
        if(curr==null) return -1;
        if(curr.next==null) return popFront();
        Node temp = curr;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        int ans = temp.next.val;
        temp.next = null;
        size--;
        return ans;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */