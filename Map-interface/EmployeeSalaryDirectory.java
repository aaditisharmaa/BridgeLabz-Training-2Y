import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 60000.0);
        salaries.put("Carol", 55000.0);
        salaries.put("David", 70000.0);
        salaries.put("Eve", 65000.0);
        salaries.put("Frank", 60000.0);

        // Give raises
        salaries.computeIfPresent("Alice", (k,v) -> v * 1.10);
        salaries.computeIfPresent("Bob", (k,v) -> v * 1.05);
        salaries.computeIfPresent("Zara", (k,v) -> v * 1.05); // Non-existent

        // Average salary
        double avg = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Average Salary: " + avg);

        // Highest paid
        double maxSalary = Collections.max(salaries.values());
        System.out.println("Highest paid employees:");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            if (e.getValue() == maxSalary) System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
