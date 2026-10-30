class BrowserHistory {
    private class Node{
        String url;
        Node prev;
        Node next;
        Node(String url){
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }
    private Node curr;
    public BrowserHistory(String homepage) {
        this.curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = curr;
        curr.next = newNode;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(steps>0 && curr.prev!=null){
            curr = curr.prev;
            steps--;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(steps>0 && curr.next!=null){
            curr = curr.next;
            steps--;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */