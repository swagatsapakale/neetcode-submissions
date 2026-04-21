class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();        
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> tempStack = new Stack<>();
        int min = stack.peek();

        while(!stack.isEmpty())
        {
            min = Math.min(min, stack.peek());
            tempStack.push(stack.pop());
        }

        while(!tempStack.isEmpty())
        {
            stack.push(tempStack.pop());
        }

        return min;
    }
}
