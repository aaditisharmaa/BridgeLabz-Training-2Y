import java.util.ArrayList;

class Faculty {
    String name;
    Faculty(String name){ this.name = name; }
}

class Department {
    String name;
    Department(String name){ this.name = name; }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculty = new ArrayList<>();

    University(String name){ this.name = name; }

    void addDepartment(Department d){ departments.add(d); }
    void addFaculty(Faculty f){ faculty.add(f); }

    void deleteUniversity(){
        System.out.println("University deleted.");
        departments.clear(); // composition → departments die
    }
}

public class Main5 {
    public static void main(String[] args) {
        University u = new University("Harvard");

        u.addDepartment(new Department("Computer Science"));
        u.addFaculty(new Faculty("Dr. Smith"));

        u.deleteUniversity();
    }
}
