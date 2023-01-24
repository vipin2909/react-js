import java.util.Stack;


// Decode a given sequence to construct minimum number without repreted digits
// best example of stack data structure

public class Main14 {
    public static String decode(String exp) {
        if(exp == null || exp.length() == 0) {
            return exp;
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= exp.length(); i++) {
            stack.push(i+1);
            if(i == exp.length() || exp.charAt(i) == 'I') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String seq = "IDIDII";
        System.out.println("The minimum number is " + decode(seq));
    }
}
