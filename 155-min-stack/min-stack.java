import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // If minStack is empty or val is smaller, push it to minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (!minStack.isEmpty() && removed == minStack.peek()) {
                minStack.pop(); // Remove from minStack only if it was the minimum
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
