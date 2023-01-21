class StackUsingLinkedlist {
    private Node top;
    private int nodesCount;

    public StackUsingLinkedlist() {
        this.top = null;
        this.nodesCount = 0;
    }

    // Function to add an element x to the stack
    public void push(int x) {
        Node newNode = new Node();
        if(newNode == null) {
            System.out.println("The heap memory is full");
            return;
        }
        System.out.println("Inserting " + x);
        newNode.data = x;
        newNode.next = top;
        top = newNode;
        this.nodesCount += 1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Function to retutn the topmost element of the stack
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(-1);
        }
        return top.data;
    }

    // Function to remove the topmost element of the stack
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(-1);
        }
        int data = top.data;
        top = top.next;
        this.nodesCount -= 1;
        return data;
    }

    public int size() {
        return this.nodesCount;
    }
    
}

public class Main2 {
    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist();
        stack.push(1);
        stack.push(2);

        stack.push(3);
        System.out.println("The top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        if(stack.isEmpty()) {
            System.out.println("The stack is empty!!");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
