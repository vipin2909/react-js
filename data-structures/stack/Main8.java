
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main8 {

    
    public static void insertPosition(Stack<Integer> stack, int ele) {
        if(stack.isEmpty() || ele > stack.peek()) {
            stack.push(ele);
            return;
        }

        int top = stack.pop();
        
        insertPosition(stack, ele);

        stack.push(top);
    }
    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();

        // recur the remaining element in stack
        sortStack(stack);

        // insert the popped element backed into stack
        insertPosition(stack, top);
    }

    public static void sortStack2(Stack<Integer> stack, Stack<Integer> result) {
        if(stack.isEmpty()) {
            return;
        }

        
        while(!stack.isEmpty()) {
            insertPosition(result, stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, -2, 9, -7, 3);
 
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
 
        System.out.println("Stack before sorting: " + stack);
        Stack<Integer> result = new Stack<>();
        sortStack2(stack, result);
        System.out.println("Stack after sorting: " + result);
    }
    
}


// in any recursive method we have to first use some element
// and than again push the element to its original position
// after calling the function itself