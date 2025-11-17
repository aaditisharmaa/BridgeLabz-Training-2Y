import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 60);
        courses.put("CS103", 2);
        courses.put("CS104", 50);
        courses.put("CS105", 4);

        // Add students
        courses.put("CS101", courses.get("CS101") + 5);
        // Drop students
        courses.put("CS103", Math.max(0, courses.get("CS103") - 1));

        System.out.println("Courses near full (>=50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50) System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Under-subscribed courses (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5) System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
