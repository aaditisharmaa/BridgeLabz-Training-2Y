class Student {
    // Static members
    static String universityName = "Global University";
    static int totalStudents = 0;

    // Instance members
    String name;
    final int rollNumber;   // cannot be changed
    char grade;

    // Constructor using 'this'
    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;   // count each student created
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update grade safely
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to: " + grade);
        } else {
            System.out.println("Invalid object! Not a student.");
        }
    }

    // Display details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid student object!");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(101, "Aditi", 'A');
        Student student2 = new Student(102, "Rahul", 'B');
        Student student3 = new Student(103, "Sneha", 'A');

        // Display details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Update grade
        student2.updateGrade('A');

        // Show total students
        Student.displayTotalStudents();
    }
}
