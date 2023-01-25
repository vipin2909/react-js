import java.util.Arrays;
import java.util.Stack;

public class Main16 {

    public static int prec(char c) {
        // Multiplication and division
        if(c == '*' || c == '/') {
            return 3;
        }

        // Addition and Subtraction
        if(c == '+' || c == '-') {
            return 4;
        }

        // Bitwise AND
        if(c == '&') {
            return 8;
        }
        // Bitwise XOR
        if(c == '^') {
            return 9;
        }

        // Bitwise OR
        if(c == '|') {
            return 10;
        }

        return Integer.MAX_VALUE;
    }

    public static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static String infixToPostfix(String infix) {
        if(infix == null || infix.length() == 0) {
            return infix;
        }

        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for(char c: infix.toCharArray()) {
            if(c == '(') {
                stack.add(c);
            }

            else if(c == ')') {
                while(stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            }

            else if(isOperand(c)) {
                postfix += c;
            }
            else {
                while(!stack.isEmpty() && prec(c) >= prec(stack.peek())) {
                    postfix += stack.pop();
                }

                stack.add(c);
            }
        }

        while(!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }
    public static void main(String[] args) {
        // String infix = "A*(B*C+D*E)+F";
        String infix = "A*B+C";

        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }
}
