import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("China", "Beijing");
        capitals.put("Australia", "Canberra");
        capitals.put("Brazil", "Brasilia");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        String country = sc.nextLine();

        String capital = capitals.getOrDefault(country, "Unknown country");
        System.out.println("Capital: " + capital);

        // Print all countries alphabetically
        TreeMap<String, String> sortedMap = new TreeMap<>(capitals);
        System.out.println("All countries and capitals:");
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
