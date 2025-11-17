import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        String[] pages = {"home","about","products","home","products","contact","home"};

        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        // Sort by descending visit count
        visits.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // Page with most visits
        String mostVisited = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most visited page: " + mostVisited);
    }
}
