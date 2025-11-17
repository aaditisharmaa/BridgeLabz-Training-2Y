import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> srcInt = Arrays.asList(1, 2, 3);
        copyList(dest, srcInt);
        System.out.println(dest);

        List<Object> destObj = new ArrayList<>();
        List<Double> srcDbl = Arrays.asList(1.1, 2.2);
        copyList(destObj, srcDbl);
        System.out.println(destObj);
    }
}
