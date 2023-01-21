import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    private int min;

    public void push(int val) {
        if(stack.empty()) {
            stack.push(val);
            min = val;
        }

        else if(val > min) {
            stack.push(val);
        }

        else {
            stack.push(2 * val - min);
            min = val;
        }
    }

    public void pop() {
        if(stack.isEmpty()) {
            System.out.println("Stack Undeflow\n");
            System.exit(-1);
        }

        int top = stack.peek();
        if(top < min) {
            min = 2 * min - top;
        }

        stack.pop();
    }

    public int getMin() {
        return min;
    }
    
}

public class Main6 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);  // 10
        minStack.push(3);  // 10 -4
        minStack.push(1);  // 10 -4 -1
        // val = -1 
        // min = 2 * 1 - (-1);
        // min = 3

        minStack.pop();  

        System.out.println("The minimum value in stack is " + minStack.getMin());

    }
}
