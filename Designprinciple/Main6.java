import java.util.ArrayList;

class Patient {
    String name;
    Patient(String name){ this.name = name; }
}

class Doctor {
    String name;
    Doctor(String name){ this.name = name; }

    void consult(Patient p){
        System.out.println(name + " is consulting " + p.name);
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name){ this.name = name; }

    void addDoctor(Doctor d){ doctors.add(d); }
    void addPatient(Patient p){ patients.add(p); }
}

public class Main6 {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo");

        Doctor d1 = new Doctor("Dr. Rahul");
        Patient p1 = new Patient("Lavanya");

        h.addDoctor(d1);
        h.addPatient(p1);

        d1.consult(p1);
    }
}
