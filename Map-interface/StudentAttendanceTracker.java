import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Alice", "Bob", "Carol", "David", "Eve");

        // Initialize all students with 0
        for (String s : students) {
            attendance.put(s, 0);
        }

        // Simulate attendance for 15 days
        List<List<String>> dailyAttendance = Arrays.asList(
            Arrays.asList("Alice","Bob","Carol"),
            Arrays.asList("Bob","David","Eve"),
            Arrays.asList("Alice","Carol"),
            Arrays.asList("Alice","Bob","Eve"),
            Arrays.asList("David","Eve"),
            Arrays.asList("Alice","Bob","Carol"),
            Arrays.asList("Bob","David"),
            Arrays.asList("Alice","Eve"),
            Arrays.asList("Carol","David"),
            Arrays.asList("Alice","Bob","Carol"),
            Arrays.asList("Alice","Eve"),
            Arrays.asList("Bob","Carol"),
            Arrays.asList("David","Eve"),
            Arrays.asList("Alice","Bob"),
            Arrays.asList("Carol","David")
        );

        for (List<String> day : dailyAttendance) {
            for (String s : day) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Attendance Records: " + attendance);

        System.out.println("Students present fewer than 10 days:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
