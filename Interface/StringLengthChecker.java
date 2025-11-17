import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFinder = str -> str.length();

        String msg = "Hello Lavanya!";
        int len = lengthFinder.apply(msg);

        System.out.println("Length: " + len);
    }
}
