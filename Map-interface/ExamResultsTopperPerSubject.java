import java.util.*;

public class ExamResultsTopperPerSubject {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        results.put("Math", new HashMap<>() {{
            put("Alice", 95); put("Bob", 88); put("Carol", 92);
        }});
        results.put("Science", new HashMap<>() {{
            put("Alice", 89); put("Bob", 91); put("Carol", 85);
        }});
        results.put("English", new HashMap<>() {{
            put("Alice", 78); put("Bob", 82); put("Carol", 90);
        }});

        // Topper per subject
        System.out.println("Topper per subject:");
        for (String subject : results.keySet()) {
            Map<String, Integer> scores = results.get(subject);
            String topper = Collections.max(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println(subject + " : " + topper + " (" + scores.get(topper) + ")");
        }

        // Average score per subject
        System.out.println("\nAverage score per subject:");
        for (String subject : results.keySet()) {
            Map<String, Integer> scores = results.get(subject);
            double avg = scores.values().stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println(subject + " : " + avg);
        }

        // Subjects with any student scoring above 90
        System.out.println("\nSubjects with at least one student scoring >90:");
        for (String subject : results.keySet()) {
            if (results.get(subject).values().stream().anyMatch(v -> v > 90)) {
                System.out.println(subject);
            }
        }
    }
}
