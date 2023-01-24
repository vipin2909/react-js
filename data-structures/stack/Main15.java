import java.util.*;

// merging overlapping intervals


class Interval {
    int begin, end;
    public Interval(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override 
    public String toString() {
        return "[" + begin + "," + end + "]";
    }
}
public class Main15 {

    public static void mergeIntervals(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.begin));
        Stack<Interval> stack = new Stack<>();

        for(Interval interval: intervals) {
            if(stack.isEmpty() || interval.begin > stack.peek().end) {
                stack.push(interval);
            }
            if(stack.peek().end < interval.end) {
                stack.peek().end = interval.end;
            }
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(1, 5), new Interval(2, 3), 
        new Interval(4, 6), new Interval(7, 8), new Interval(8, 10), new Interval(12, 15));

        mergeIntervals(intervals);
    }
}
