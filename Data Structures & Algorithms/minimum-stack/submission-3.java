class MinStack {

    // private Stack<Integer> stack;

    // public MinStack() {
    //     stack = new Stack<>();        
    // }
    
    // public void push(int val) {
    //     stack.push(val);
    // }
    
    // public void pop() {
    //     stack.pop();
    // }
    
    // public int top() {
    //     return stack.peek();
    // }
    
    // public int getMin() {
    //     //Appoach 1: O(n)
    //     Stack<Integer> tempStack = new Stack<>();
    //     int min = stack.peek();

    //     while(!stack.isEmpty())
    //     {
    //         min = Math.min(min, stack.peek());
    //         tempStack.push(stack.pop());
    //     }

    //     while(!tempStack.isEmpty())
    //     {
    //         stack.push(tempStack.pop());
    //     }

    //     return min;

    // }

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // int stackTop = stack.peek();
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
