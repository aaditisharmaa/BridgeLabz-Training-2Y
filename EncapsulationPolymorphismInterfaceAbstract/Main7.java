interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println(patientId + " | " + name + " | Age: " + age);
    }

    abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge = 2000;
    private String record = "";

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() { return roomCharge + 5000; }
    public void addRecord(String r) { record = r; }
    public void viewRecords() { System.out.println("Record: " + record); }
}

class OutPatient extends Patient implements MedicalRecord {
    private String record = "";

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() { return 800; }
    public void addRecord(String r) { record = r; }
    public void viewRecords() { System.out.println("Record: " + record); }
}

public class Main7 {
    public static void main(String[] args) {
        Patient[] p = {
            new InPatient(1, "Lavanya", 22),
            new OutPatient(2, "Meera", 20)
        };

        for (Patient x : p) {
            x.getPatientDetails();
            System.out.println("Bill: " + x.calculateBill());
            System.out.println("---------------------------");
        }
    }
}
