import java.util.*;

public class ReverseListDemo {
    public static <T> void reverseList(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
