import java.util.Stack;
import java.util.Arrays;

// finding next greater element in an array using stack data structure

public class Main18 {
    public static int[] findNextGreaterElement(int[] arr) {
        if(arr == null) {
            return arr;
        }

        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 5, 4, 6, 8};
        int[] result = findNextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }
}