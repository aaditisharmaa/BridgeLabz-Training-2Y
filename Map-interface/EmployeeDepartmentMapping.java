import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");

        // Change department
        empDept.put(103, "IT");

        // Reverse lookup: employees in IT
        System.out.println("Employees in IT:");
        empDept.forEach((id, dept) -> { if(dept.equals("IT")) System.out.println(id); });

        // Total employees per department
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }
        System.out.println("Employee count per department: " + deptCount);
    }
}
