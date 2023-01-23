import java.util.Stack;

// program to find empty parenthesis without any expression inside it
public class Main12 {
    
    public static boolean hasDuplicateParentheses(String str) {
        if(str == null || str.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()) {
            if(c != ')') {
                stack.push(c);
            }

            else {
                if(stack.peek() == '(') {
                    return true;
                }

                while(stack.peek() != '(') {
                    stack.pop();
                }

                stack.pop();
            }


        }
        return false;

    }
    public static void main(String[] args) {
        String exp = "((x+y))";
        if(hasDuplicateParentheses(exp)) {
            System.out.println("The expression has duplicate parentheses");
        }
        else {
            System.out.println("The expression does not have dupluicate parenthesis");
        }
    }
 
}
