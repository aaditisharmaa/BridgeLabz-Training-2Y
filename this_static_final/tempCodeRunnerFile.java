class Patient {
    // Static members
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    // Instance members
    String name;
    int age;
    String ailment;
    final int patientID; // Unique ID (cannot be changed)

    // Constructor using 'this'
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Count new patient
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("------------------------------");
        } else {
            System.out.println("Invalid patient object!");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create patient objects
        Patient p1 = new Patient(101, "Aarav", 25, "Fever");
        Patient p2 = new Patient(102, "Meera", 30, "Asthma");
        Patient p3 = new Patient(103, "Rohan", 40, "Diabetes");

        // Display all patients
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        p3.displayPatientDetails();

        // Show total patients admitted
        Patient.getTotalPatients();
    }
}
