import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "High BP Alert",
                "Low Sugar Alert",
                "Critical Condition",
                "Routine Checkup"
        );

        Predicate<String> critical = msg -> msg.contains("Critical");
        Predicate<String> bpAlerts = msg -> msg.contains("BP");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(critical).forEach(System.out::println);

        System.out.println("\nBP Alerts:");
        alerts.stream().filter(bpAlerts).forEach(System.out::println);
    }
}
