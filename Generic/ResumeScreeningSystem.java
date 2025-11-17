import java.util.*;

public class ResumeScreeningSystem {
    static abstract class JobRole {}
    static class SoftwareEngineer extends JobRole {}
    static class DataScientist extends JobRole {}
    static class ProductManager extends JobRole {}

    static class Resume<T extends JobRole> {
        String candidate;
        T role;
        Resume(String candidate, T role){this.candidate=candidate;this.role=role;}
        public String toString(){ return candidate + " for " + role.getClass().getSimpleName(); }
    }

    public static void processResumes(List<? extends JobRole> roles) {
        System.out.println("Processing " + roles.size() + " role entries.");
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", new DataScientist());

        List<Resume<?>> list = Arrays.asList(r1, r2);
        for (Resume<?> r : list) System.out.println(r);
    }
}
