import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Lavanya", "Rishi", "Meera");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
