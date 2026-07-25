
class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int topElement;

    public void push(int x) {
        q1.add(x);
        topElement = x; // Track top element for O(1) top() reads
    }
    
    public int pop() {
        // Move all elements except the last one to q2
        while (q1.size() > 1) {
            topElement = q1.remove();
            q2.add(topElement);
        }
        int removed = q1.remove(); // The last element is the LIFO target
        
        // Swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return removed;
    }
    
    // O(1) Time (due to tracking variable)
    public int top() {
        return topElement;
    }
    
    // O(1) Time
    public boolean empty() {
        return q1.isEmpty();
    }
}
