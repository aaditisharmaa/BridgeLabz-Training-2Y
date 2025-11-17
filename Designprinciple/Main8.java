import java.util.ArrayList;

class Professor {
    String name;
    Professor(String name){ this.name = name; }
}

class Course {
    String name;
    Professor prof;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name){ this.name = name; }

    void assignProfessor(Professor p){
        prof = p;
    }

    void addStudent(Student s){
        students.add(s);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name){ this.name = name; }

    void enrollCourse(Course c){
        courses.add(c);
        c.addStudent(this);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Professor p = new Professor("Dr. Mehta");
        Course c = new Course("AI");

        Student s = new Student("Lavanya");

        c.assignProfessor(p);
        s.enrollCourse(c);

        System.out.println("Professor: " + c.prof.name);
        System.out.println("Student enrolled: " + s.name);
    }
}
