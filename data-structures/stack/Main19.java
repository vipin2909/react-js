import java.util.Arrays;
import java.util.Stack;

public class Main19 {
    public static int[] findPrevSmallerElement(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 8, 1, 9};
        int[] result  = findPrevSmallerElement(arr);
        System.out.println(Arrays.toString(result));

    }
}
