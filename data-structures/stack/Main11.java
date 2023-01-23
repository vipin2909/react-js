import java.util.Stack;

// program to check if parenthesis are balanced or not

public class Main11 {

    public static boolean isBalanced(String exp) {
        if(exp == null || exp.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char ch: exp.toCharArray()) {
            if(ch == '(') {
                stack.push(')');
            }
            else if(ch == '{') {
                stack.push('}');
            }
            else if(ch == '[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{()}[{}]";

        if(isBalanced(expression)) {
            System.out.println("The expression is balanced");
        }
        else {
            System.out.println("Parenthesis are not balanced");
        }
    }
}
