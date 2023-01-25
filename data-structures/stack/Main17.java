import java.util.Arrays;
import java.util.Stack;

public class Main17 {

    public static int[] findNextGreater(int[] arr) {
        if(arr == null) {
            return arr;
        }

        int n = arr.length;
        int[] output = new int[n];

        Arrays.fill(output, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 2 * n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i % n]) {
                output[stack.pop()] = arr[i % n];
            }
            stack.add(i % n);
        }
        return output;

    }
    public static void main(String[] args) {
        int[] input = {3, 5, 2, 4};
        int[] out = findNextGreater(input);
        System.out.println(Arrays.toString(out));

    }
}
