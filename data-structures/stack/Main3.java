import java.util.ArrayDeque;
import java.util.Queue;

// in this we are implementing a srack using two queues

class StackUsingQueue<T> {
    Queue<T> q1, q2;

    public StackUsingQueue() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    // Insert an item into stack
    void add(T data) {
        while(!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }

        q1.add(data);

        while(!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public T poll() {
        if(q1.isEmpty()) {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        T front = q1.peek();
        q1.poll();
        return front;
    }

    
}
public class Main3 {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5, 6};

        StackUsingQueue<Integer> stack = new StackUsingQueue<>();

        for(int i = 0; i < keys.length; i++) {
            stack.add(keys[i]);
        }
        for(int i = 0; i < keys.length; i++) {
            System.out.println(stack.poll());
        }
    }
}
