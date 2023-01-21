import java.util.Stack;

// implementing Queue using stack

class Queue<T> {
    private Stack<T> stack1, stack2;

    public Queue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }

        stack1.add(value);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    public T dequeue() {
        if(stack1.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        T front = stack1.peek();
        stack1.pop();
        return front;
    }
}

public class Main4 {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5, 6, 7};
        Queue<Integer> queue = new Queue<>();
        for(int key : keys) {
            queue.enqueue(key);
        }

        for(int i = 0; i < keys.length; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
