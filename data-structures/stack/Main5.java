import java.util.Stack;

public class Main5 {
    private Stack<Integer> s;
    private Stack<Integer> aux;

    public Main5() {
        s = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if(aux.isEmpty()) {
            aux.push(x);
        }
        else {
            if(aux.peek() >= x) {
                aux.push(x);
            }
        }
    }

    public int pop() {
        if(s.isEmpty()) {
            System.out.println("Stack Underflow !!");
            return -1;
        }
        int x = s.pop();
        if(x == aux.peek()) {
            aux.pop();
        }
        return x;
    }

    public int top() {
        return s.peek();
    }

    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public int getMin() {
        if(aux.isEmpty()) {
            System.out.println("Stack Underflow!!");
            System.exit(-1);
        }
        return aux.peek();
    }

    public static void main(String[] args) {
        Main5 main5 = new Main5();
        main5.push(1);
        main5.push(2);
        main5.push(3);

        System.out.println("The minimum element is " + main5.getMin());
    }
}
