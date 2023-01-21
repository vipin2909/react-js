// in this we are implementing a stack using simple array


class StackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;

    StackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Function to add an element x to the stack
    public void push(int x) {
        if(isFull()) {
            System.out.println("Overflow\nProgram Termination\n");
            System.exit(-1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Function to remove an element from the stack
    public int pop() {
        if(isEmpty()) {
            System.out.println("Underflow\nProgram Termination\n");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }
    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
    // Function to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Underflow\nProgram Termination\n"); 
            System.exit(-1);
        }
        else {
            return arr[top];
        }
    
        return -1;
    }

}
public class Main1 {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.push(6);

        System.out.println("The top element is " + stack.peek());
        System.out.println("The size of the stack is " + stack.size());

        stack.pop();

        if(stack.isEmpty()) {
            System.out.println("Stack is empty\n");
        }
        else {
            System.out.println("The top element is " + stack.peek());
        }
    }
}