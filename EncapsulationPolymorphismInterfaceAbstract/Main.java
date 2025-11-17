interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0)
            this.baseSalary = baseSalary;
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId
                + " | Name: " + name
                + " | Base Salary: " + baseSalary
                + " | Department: " + department);
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double base, int hours, double rate) {
        super(id, name, base);
        this.workingHours = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Lavanya", 35000);
        e1.assignDepartment("HR");

        Employee e2 = new PartTimeEmployee(102, "Meera", 0, 40, 300);
        e2.assignDepartment("Support");

        Employee[] employees = { e1, e2 };

        for(Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("---------------------------------");
        }
    }
}
