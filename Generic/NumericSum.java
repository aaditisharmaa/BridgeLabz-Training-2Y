import java.util.List;
import java.util.Arrays;

public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(Arrays.asList(1, 2, 3)));            // Integer list
        System.out.println(sumNumbers(Arrays.asList(1.5, 2.5, 3.0)));    // Double list
    }
}
