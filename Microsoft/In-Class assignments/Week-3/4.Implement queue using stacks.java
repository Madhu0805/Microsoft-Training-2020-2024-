lass MyQueue {
    Stack<Integer> storage = null;
    Stack<Integer> temp = null;
    
    public MyQueue() {
        storage = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        while(!storage.empty()) {
            temp.push(storage.pop());
        }
        temp.push(x);
        while(!temp.empty()) {
            storage.push(temp.pop());
        }
    }
    
    public int pop() {
        return storage.pop();
    }
    
    public int peek() {
        return storage.peek();
    }
    
    public boolean empty() {
        return storage.empty();
    }
}
