import java.util.Stack;

public class Main10 {

    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void swap(char[] chars, int i, int j) {
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
    }
    public static void reverse(char[] chars, int i, int j) {
        if(i < j) {
            swap(chars, i, j);
            reverse(chars, i+1, j-1);
        }
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length-1);
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "reverse me";
        // str = reverseStringUsingStack(str);
        // System.out.println(str);
        str = reverse(str);
        System.out.println(str);
    }    
}
