import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String dept) {
        this.name = name;
        this.department = dept;
    }

    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee e : employees) {
            deptMap.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }

        System.out.println("Employees grouped by department: " + deptMap);
    }
}
