import java.util.*;

public class UniversityCourseManagement {
    static abstract class CourseType {}
    static class ExamCourse extends CourseType {}
    static class AssignmentCourse extends CourseType {}
    static class ResearchCourse extends CourseType {}

    static class Course<T extends CourseType> {
        String name;
        T type;
        Course(String name, T type){this.name=name;this.type=type;}
        public String toString(){return name + " [" + type.getClass().getSimpleName() + "]";}
    }

    public static void printCourses(List<? extends CourseType> dummy) {
        // placeholder - method demonstrating wildcard usage
        System.out.println("Received list of course types, size: " + dummy.size());
    }

    public static void main(String[] args) {
        Course<ExamCourse> c1 = new Course<>("Math", new ExamCourse());
        Course<ResearchCourse> c2 = new Course<>("AI Research", new ResearchCourse());

        List<Course<?>> courses = Arrays.asList(c1, c2);
        for (Course<?> c : courses) System.out.println(c);
    }
}
