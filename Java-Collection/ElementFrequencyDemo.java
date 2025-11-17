import java.util.*;

public class ElementFrequencyDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Element Frequency: " + frequencyMap);
    }
}
