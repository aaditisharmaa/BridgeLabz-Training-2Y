import java.util.ArrayList;

class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName){
        this.deptName = deptName;
    }

    void addEmployee(Employee e){
        employees.add(e);
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName){
        this.companyName = companyName;
    }

    void addDepartment(Department d){
        departments.add(d);
    }

    void deleteCompany(){
        System.out.println("Deleting company: " + companyName);
        departments.clear();   // employees also deleted
    }
}

public class Main3 {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("HR");
        d1.addEmployee(new Employee("John"));

        c.addDepartment(d1);

        c.deleteCompany(); // composition effect
    }
}
