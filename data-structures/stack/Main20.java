import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// code to find elements which has all smaller elements to the right

public class Main20 {
    public static List<Integer> findGreaterElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        int maxEle = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= maxEle) {
                maxEle = arr[i];
                ans.add(maxEle);
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        System.out.println(findGreaterElements(arr));
    }
}
