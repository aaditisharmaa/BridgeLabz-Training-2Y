import java.util.*;

public class NthFromEndDemo {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> slow = list.iterator();
        Iterator<T> fast = list.iterator();

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                throw new IllegalArgumentException("N is greater than list size");
            }
        }

        // Move both until fast reaches the end
        while (fast.hasNext()) {
            slow.next();
            fast.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println(n + "th element from end: " + findNthFromEnd(list, n));
    }
}
