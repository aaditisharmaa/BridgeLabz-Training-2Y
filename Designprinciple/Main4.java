import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Course(String name){ this.name = name; }

    void addStudent(Student s){
        students.add(s);
    }

    void showStudents(){
        System.out.println("Course: " + name);
        for(Student s : students){
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name){ this.name = name; }

    void enroll(Course c){
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses(){
        System.out.println(name + " enrolled in:");
        for(Course c : courses)
            System.out.println(c.name);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name){ this.name = name; }

    void addStudent(Student s){
        students.add(s);
    }
}

public class Main4 {
    public static void main(String[] args) {
        School sc = new School("DPS");

        Student s1 = new Student("Lavanya");
        Student s2 = new Student("Arjun");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        sc.addStudent(s1);
        sc.addStudent(s2);

        s1.showCourses();
        c1.showStudents();
    }
}
