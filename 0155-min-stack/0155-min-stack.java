class MinStack {
    // Stack<int[]> stack;
    // public MinStack() {
    //     stack = new Stack<>();
    // }
    
    // public void push(int value) {
    //     if(stack.isEmpty()){
    //         stack.push(new int[] {value, value});
    //         return;
    //     }
    //     int mini = Math.min(getMin(), value);
    //     stack.push(new int[] {value, mini});
    // }
    
    // public void pop() {
    //     stack.pop();
    // }
    
    // public int top() {
    //     return stack.peek()[0];
    // }
    
    // public int getMin() {
    //     return stack.peek()[1];
    // }

    // Optimal solution using (2*val-prevVal)

    Stack<Long> stack;
    long min;

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int val){
        long x = val;
        if(stack.isEmpty()){
            min = x;
            stack.push(x);
            return;
        }

        if(x>=min){
            stack.push(x);
        }
        else{
            stack.push(2*x-min);
            min = x;
        }
    }
    public void pop(){
        if(stack.isEmpty()){
            return;
        }
        long popedVal = stack.pop();
        if(popedVal<min){
            min = 2*min-popedVal;
        }
    }

    public int top(){
        if(stack.isEmpty()){
            return -1;
        }
        long x = stack.peek();
        if(min<x) return (int) x;
        return (int) min;
    }

    public int getMin(){
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */